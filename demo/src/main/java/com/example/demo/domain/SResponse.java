/**
 * 
 */
package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author dinesh.joshi
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "hostname" })
public class SResponse {

	@JsonProperty("hostname")
	private String hostname;

	@JsonProperty("client")
	private String client;

	@JsonProperty("forwarded")
	private String forwarded;

	@JsonProperty("servername")
	private String servername;

	@JsonProperty("serverport")
	private int serverport;

	@JsonProperty("remotehost")
	private String remotehost;

	@JsonProperty("remoteport")
	private int remoteport;

	/**
	 * 
	 * @param hostname
	 */
	public SResponse(String hostname, String client, String forwarded, String servername, int serverport,
			String remotehost, int remoteport) {
		super();
		this.hostname = hostname;
		this.client = client;
		this.forwarded = forwarded;
		this.servername = servername;
		this.serverport = serverport;
		this.remotehost = remotehost;
		this.remoteport = remoteport;
	}

	@JsonProperty("hostname")
	public String getHostname() {
		return hostname;
	}

	@JsonProperty("hostname")
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	@JsonProperty("client")
	public String getClient() {
		return client;
	}

	@JsonProperty("client")
	public void setClient(String client) {
		this.client = client;
	}

	@JsonProperty("forwarded")
	public String getForwarded() {
		return forwarded;
	}

	@JsonProperty("forwarded")
	public void setForwarded(String forwarded) {
		this.forwarded = forwarded;
	}

	@JsonProperty("servername")
	public String getServername() {
		return servername;
	}

	@JsonProperty("servername")
	public void setServername(String servername) {
		this.servername = servername;
	}

	@JsonProperty("serverport")
	public int getServerport() {
		return serverport;
	}

	@JsonProperty("serverport")
	public void setServerport(int serverport) {
		this.serverport = serverport;
	}

	@JsonProperty("remotehost")
	public String getRemotehost() {
		return remotehost;
	}

	@JsonProperty("remotehost")
	public void setRemotehost(String remotehost) {
		this.remotehost = remotehost;
	}

	@JsonProperty("remoteport")
	public int getRemoteport() {
		return remoteport;
	}

	@JsonProperty("remoteport")
	public void setRemoteport(int remoteport) {
		this.remoteport = remoteport;
	}

}
