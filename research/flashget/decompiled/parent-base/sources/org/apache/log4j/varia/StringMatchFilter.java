package org.apache.log4j.varia;

import org.apache.log4j.helpers.OptionConverter;
import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public class StringMatchFilter extends Filter {
    boolean acceptOnMatch = true;
    String stringToMatch;
    public static final String STRING_TO_MATCH_OPTION = "StringToMatch";
    public static final String ACCEPT_ON_MATCH_OPTION = "AcceptOnMatch";

    @Override // org.apache.log4j.spi.Filter
    public int decide(LoggingEvent loggingEvent) {
        String str;
        String renderedMessage = loggingEvent.getRenderedMessage();
        if (renderedMessage == null || (str = this.stringToMatch) == null || renderedMessage.indexOf(str) == -1) {
            return 0;
        }
        return this.acceptOnMatch ? 1 : -1;
    }

    public boolean getAcceptOnMatch() {
        return this.acceptOnMatch;
    }

    public String[] getOptionStrings() {
        return new String[]{"StringToMatch", "AcceptOnMatch"};
    }

    public String getStringToMatch() {
        return this.stringToMatch;
    }

    public void setAcceptOnMatch(boolean z4) {
        this.acceptOnMatch = z4;
    }

    public void setOption(String str, String str2) {
        if (str.equalsIgnoreCase("StringToMatch")) {
            this.stringToMatch = str2;
        } else if (str.equalsIgnoreCase("AcceptOnMatch")) {
            this.acceptOnMatch = OptionConverter.toBoolean(str2, this.acceptOnMatch);
        }
    }

    public void setStringToMatch(String str) {
        this.stringToMatch = str;
    }
}
