package org.apache.log4j;

import org.apache.log4j.helpers.OptionConverter;
import org.apache.log4j.helpers.PatternConverter;
import org.apache.log4j.helpers.PatternParser;
import org.apache.log4j.pattern.BridgePatternConverter;
import org.apache.log4j.pattern.BridgePatternParser;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public class EnhancedPatternLayout extends Layout {
    protected final int BUF_SIZE;
    protected final int MAX_CAPACITY;
    private String conversionPattern;
    private boolean handlesExceptions;
    private PatternConverter head;
    public static final String PATTERN_RULE_REGISTRY = "PATTERN_RULE_REGISTRY";
    public static final String DEFAULT_CONVERSION_PATTERN = "%m%n";
    public static final String TTCC_CONVERSION_PATTERN = "%r [%t] %p %c %x - %m%n";

    public EnhancedPatternLayout() {
        this("%m%n");
    }

    @Override // org.apache.log4j.spi.OptionHandler
    public void activateOptions() {
    }

    protected PatternParser createPatternParser(String str) {
        return new BridgePatternParser(str);
    }

    @Override // org.apache.log4j.Layout
    public String format(LoggingEvent loggingEvent) {
        StringBuffer stringBuffer = new StringBuffer();
        for (PatternConverter patternConverter = this.head; patternConverter != null; patternConverter = patternConverter.next) {
            patternConverter.format(stringBuffer, loggingEvent);
        }
        return stringBuffer.toString();
    }

    public String getConversionPattern() {
        return this.conversionPattern;
    }

    @Override // org.apache.log4j.Layout
    public boolean ignoresThrowable() {
        return !this.handlesExceptions;
    }

    public void setConversionPattern(String str) {
        String convertSpecialChars = OptionConverter.convertSpecialChars(str);
        this.conversionPattern = convertSpecialChars;
        PatternConverter parse = createPatternParser(convertSpecialChars).parse();
        this.head = parse;
        if (parse instanceof BridgePatternConverter) {
            this.handlesExceptions = !((BridgePatternConverter) parse).ignoresThrowable();
        } else {
            this.handlesExceptions = false;
        }
    }

    public EnhancedPatternLayout(String str) {
        this.BUF_SIZE = 256;
        this.MAX_CAPACITY = 1024;
        this.conversionPattern = str;
        PatternConverter parse = createPatternParser(str == null ? "%m%n" : str).parse();
        this.head = parse;
        if (parse instanceof BridgePatternConverter) {
            this.handlesExceptions = !((BridgePatternConverter) parse).ignoresThrowable();
        } else {
            this.handlesExceptions = false;
        }
    }
}
