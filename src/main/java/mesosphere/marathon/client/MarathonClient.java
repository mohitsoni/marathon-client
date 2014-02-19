package mesosphere.marathon.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import feign.Feign;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;

public class MarathonClient {
	static class MarathonHeadersInterceptor implements RequestInterceptor {
		@Override
		public void apply(RequestTemplate template) {
			template.header("Accept", "application/json");
		}
	}

	public static Marathon getInstance(String endpoint) {
		Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping()
				.create();
		GsonDecoder decoder = new GsonDecoder(gson);
		GsonEncoder encoder = new GsonEncoder(gson);
		return Feign.builder().encoder(encoder).decoder(decoder)
				.requestInterceptor(new MarathonHeadersInterceptor())
				.target(Marathon.class, endpoint);
	}
}
