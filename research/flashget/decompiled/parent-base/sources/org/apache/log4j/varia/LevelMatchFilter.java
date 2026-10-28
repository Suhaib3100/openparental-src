package org.apache.log4j.varia;

import org.apache.log4j.Level;
import org.apache.log4j.helpers.OptionConverter;
import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public class LevelMatchFilter extends Filter {
    boolean acceptOnMatch = true;
    Level levelToMatch;

    @Override // org.apache.log4j.spi.Filter
    public int decide(LoggingEvent loggingEvent) {
        Level level = this.levelToMatch;
        if (level != null && level.equals(loggingEvent.getLevel())) {
            return this.acceptOnMatch ? 1 : -1;
        }
        return 0;
    }

    public boolean getAcceptOnMatch() {
        return this.acceptOnMatch;
    }

    public String getLevelToMatch() {
        Level level = this.levelToMatch;
        if (level == null) {
            return null;
        }
        return level.toString();
    }

    public void setAcceptOnMatch(boolean z4) {
        this.acceptOnMatch = z4;
    }

    public void setLevelToMatch(String str) {
        this.levelToMatch = OptionConverter.toLevel(str, null);
    }
}
