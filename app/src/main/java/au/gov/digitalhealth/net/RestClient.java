package au.gov.digitalhealth.net;

import ca.uhn.hl7v2.conf.ProfileException;

import org.json.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class RestClient {

	private String baseUrl;

	public RestClient(String baseServer) throws ProfileException {
		if (baseServer == null) {
			throw new ProfileException("The server base url parameter cannot be null");
		}
		this.baseUrl = baseServer;

	}

	public boolean doesCodeExist(String fhirOp) {
		boolean response = false;
		try {
			URL url = new URL(baseUrl + fhirOp);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/fhir+json");
	
			if (conn.getResponseCode() == 200) {
				response = true;
			}
			conn.disconnect();
	
		  } catch (MalformedURLException e) {
			e.printStackTrace();
		  } catch (IOException e) {
			e.printStackTrace();
		  }
		return response;
	}

	public boolean doesTextMatchDisplayName(String fhirOp, String text) {
		boolean response = false;
		try {
			URL url = new URL(baseUrl + fhirOp);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/fhir+json");
	
			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));
				
			JSONObject obj = new JSONObject(org.apache.commons.io.IOUtils.toString(br));
			conn.disconnect();

			JSONArray arr = obj.getJSONArray("parameter");
			for (int i = 0; i < arr.length(); i++) {
				String name = arr.getJSONObject(i).getString("name");
				if (!arr.getJSONObject(i).isNull("valueString")) {
					String valueString = arr.getJSONObject(i).getString("valueString");
					if (name.equals("display") && valueString != null && text != null) {
						if (text.equals(valueString)) {
							response = true;
						}
					}
				}
			}
		  } catch (MalformedURLException e) {
			e.printStackTrace();
		  } catch (IOException e) {
			e.printStackTrace();
		  }
		return response;
	}

	public static void main(String[] args) {

	  try {

        // URL url = new URL("https://r4.ontoserver.csiro.au/fhir/CodeSystem/$lookup?system=http://snomed.info/sct&code=900000000000013009");
		URL url = new URL("https://r4.ontoserver.csiro.au/fhir/CodeSystem/$lookup?system=http://loinc.org&code=39156-5");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/fhir+json");

		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ conn.getResponseCode());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(
			(conn.getInputStream())));

		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

		conn.disconnect();

	  } catch (MalformedURLException e) {
		e.printStackTrace();
	  } catch (IOException e) {
		e.printStackTrace();
	  }

	}

}
