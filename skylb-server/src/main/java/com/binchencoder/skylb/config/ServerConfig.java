package com.binchencoder.skylb.config;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import java.time.Duration;

@Parameters(separators = "=")
public class ServerConfig {

  @Parameter(names = {"--port", "-port"},
      description = "The gRPC server port, e.g., 1900")
  private int port = 1900;

  @Parameter(names = {"--scrape-addr", "-scrape-addr"},
      description = "The address to listen on for HTTP requests., e.g., :1920")
  private String scrapeAddr = ":1920";

  @Parameter(names = {"--within-k8s", "-within-k8s"},
      description = "Whether SkyLB is running in kubernetes")
  private boolean withInK8s = false;

  @Parameter(names = {"--auto-rectify-interval", "-auto-rectify-interval"},
      description = "The interval of auto rectification. e.g. 10s(10 Seconds), 10m(10 Minutes)")
  private Duration autoRectifyInterval = Duration.ofSeconds(60);

  public int getPort() {
    return port;
  }

  public void setPort(int port) {
    this.port = port;
  }

  public String getScrapeAddr() {
    return scrapeAddr;
  }

  public void setScrapeAddr(String scrapeAddr) {
    this.scrapeAddr = scrapeAddr;
  }

  public boolean isWithInK8s() {
    return withInK8s;
  }

  public long getAutoRectifyInterval() {
    return autoRectifyInterval.toMillis();
  }
}
