package com.semih.javaeight.dateAPI;

import java.sql.Date;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateAPI {

  private static final Logger LOG = LoggerFactory.getLogger(DateAPI.class);

  public void dateAPIEx() {
    Clock clock = Clock.systemDefaultZone();
    ZoneId zoneId = clock.getZone();
    Instant instant = clock.instant();
    LOG.info(String.valueOf(Date.from(instant)));
  }
}
