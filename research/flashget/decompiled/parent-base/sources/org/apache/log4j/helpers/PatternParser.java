package org.apache.log4j.helpers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import org.apache.log4j.Layout;
import org.apache.log4j.spi.LocationInfo;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public class PatternParser {
    static final int CLASS_LOCATION_CONVERTER = 1002;
    private static final int CONVERTER_STATE = 1;
    private static final int DOT_STATE = 3;
    private static final char ESCAPE_CHAR = '%';
    static final int FILE_LOCATION_CONVERTER = 1004;
    static final int FULL_LOCATION_CONVERTER = 1000;
    static final int LEVEL_CONVERTER = 2002;
    static final int LINE_LOCATION_CONVERTER = 1003;
    private static final int LITERAL_STATE = 0;
    private static final int MAX_STATE = 5;
    static final int MESSAGE_CONVERTER = 2004;
    static final int METHOD_LOCATION_CONVERTER = 1001;
    private static final int MIN_STATE = 4;
    static final int NDC_CONVERTER = 2003;
    static final int RELATIVE_TIME_CONVERTER = 2000;
    static final int THREAD_CONVERTER = 2001;
    PatternConverter head;

    /* renamed from: i, reason: collision with root package name */
    protected int f86719i;
    protected String pattern;
    protected int patternLength;
    PatternConverter tail;
    protected StringBuffer currentLiteral = new StringBuffer(32);
    protected FormattingInfo formattingInfo = new FormattingInfo();
    int state = 0;

    private static class BasicPatternConverter extends PatternConverter {
        int type;

        BasicPatternConverter(FormattingInfo formattingInfo, int i4) {
            super(formattingInfo);
            this.type = i4;
        }

        @Override // org.apache.log4j.helpers.PatternConverter
        public String convert(LoggingEvent loggingEvent) {
            switch (this.type) {
                case 2000:
                    return Long.toString(loggingEvent.timeStamp - LoggingEvent.getStartTime());
                case 2001:
                    return loggingEvent.getThreadName();
                case 2002:
                    return loggingEvent.getLevel().toString();
                case 2003:
                    return loggingEvent.getNDC();
                case 2004:
                    return loggingEvent.getRenderedMessage();
                default:
                    return null;
            }
        }
    }

    private class CategoryPatternConverter extends NamedPatternConverter {
        CategoryPatternConverter(FormattingInfo formattingInfo, int i4) {
            super(formattingInfo, i4);
        }

        @Override // org.apache.log4j.helpers.PatternParser.NamedPatternConverter
        String getFullyQualifiedName(LoggingEvent loggingEvent) {
            return loggingEvent.getLoggerName();
        }
    }

    private class ClassNamePatternConverter extends NamedPatternConverter {
        ClassNamePatternConverter(FormattingInfo formattingInfo, int i4) {
            super(formattingInfo, i4);
        }

        @Override // org.apache.log4j.helpers.PatternParser.NamedPatternConverter
        String getFullyQualifiedName(LoggingEvent loggingEvent) {
            return loggingEvent.getLocationInformation().getClassName();
        }
    }

    private static class DatePatternConverter extends PatternConverter {
        private Date date;

        /* renamed from: df, reason: collision with root package name */
        private DateFormat f86720df;

        DatePatternConverter(FormattingInfo formattingInfo, DateFormat dateFormat) {
            super(formattingInfo);
            this.date = new Date();
            this.f86720df = dateFormat;
        }

        @Override // org.apache.log4j.helpers.PatternConverter
        public String convert(LoggingEvent loggingEvent) {
            this.date.setTime(loggingEvent.timeStamp);
            try {
                return this.f86720df.format(this.date);
            } catch (Exception e4) {
                LogLog.error("Error occured while converting date.", e4);
                return null;
            }
        }
    }

    private static class LiteralPatternConverter extends PatternConverter {
        private String literal;

        LiteralPatternConverter(String str) {
            this.literal = str;
        }

        @Override // org.apache.log4j.helpers.PatternConverter
        public String convert(LoggingEvent loggingEvent) {
            return this.literal;
        }

        @Override // org.apache.log4j.helpers.PatternConverter
        public final void format(StringBuffer stringBuffer, LoggingEvent loggingEvent) {
            stringBuffer.append(this.literal);
        }
    }

    private class LocationPatternConverter extends PatternConverter {
        int type;

        LocationPatternConverter(FormattingInfo formattingInfo, int i4) {
            super(formattingInfo);
            this.type = i4;
        }

        @Override // org.apache.log4j.helpers.PatternConverter
        public String convert(LoggingEvent loggingEvent) {
            LocationInfo locationInformation = loggingEvent.getLocationInformation();
            switch (this.type) {
                case 1000:
                    return locationInformation.fullInfo;
                case 1001:
                    return locationInformation.getMethodName();
                case 1002:
                default:
                    return null;
                case 1003:
                    return locationInformation.getLineNumber();
                case 1004:
                    return locationInformation.getFileName();
            }
        }
    }

    private static class MDCPatternConverter extends PatternConverter {
        private String key;

        MDCPatternConverter(FormattingInfo formattingInfo, String str) {
            super(formattingInfo);
            this.key = str;
        }

        @Override // org.apache.log4j.helpers.PatternConverter
        public String convert(LoggingEvent loggingEvent) {
            String str = this.key;
            if (str != null) {
                Object mdc = loggingEvent.getMDC(str);
                if (mdc == null) {
                    return null;
                }
                return mdc.toString();
            }
            StringBuffer stringBuffer = new StringBuffer("{");
            Map properties = loggingEvent.getProperties();
            if (properties.size() > 0) {
                Object[] array = properties.keySet().toArray();
                Arrays.sort(array);
                for (int i4 = 0; i4 < array.length; i4++) {
                    stringBuffer.append('{');
                    stringBuffer.append(array[i4]);
                    stringBuffer.append(',');
                    stringBuffer.append(properties.get(array[i4]));
                    stringBuffer.append('}');
                }
            }
            stringBuffer.append('}');
            return stringBuffer.toString();
        }
    }

    private static abstract class NamedPatternConverter extends PatternConverter {
        int precision;

        NamedPatternConverter(FormattingInfo formattingInfo, int i4) {
            super(formattingInfo);
            this.precision = i4;
        }

        @Override // org.apache.log4j.helpers.PatternConverter
        public String convert(LoggingEvent loggingEvent) {
            String fullyQualifiedName = getFullyQualifiedName(loggingEvent);
            if (this.precision <= 0) {
                return fullyQualifiedName;
            }
            int length = fullyQualifiedName.length();
            int i4 = length - 1;
            for (int i5 = this.precision; i5 > 0; i5--) {
                i4 = fullyQualifiedName.lastIndexOf(46, i4 - 1);
                if (i4 == -1) {
                    return fullyQualifiedName;
                }
            }
            return fullyQualifiedName.substring(i4 + 1, length);
        }

        abstract String getFullyQualifiedName(LoggingEvent loggingEvent);
    }

    public PatternParser(String str) {
        this.pattern = str;
        this.patternLength = str.length();
    }

    private void addToList(PatternConverter patternConverter) {
        if (this.head == null) {
            this.tail = patternConverter;
            this.head = patternConverter;
        } else {
            this.tail.next = patternConverter;
            this.tail = patternConverter;
        }
    }

    protected void addConverter(PatternConverter patternConverter) {
        this.currentLiteral.setLength(0);
        addToList(patternConverter);
        this.state = 0;
        this.formattingInfo.reset();
    }

    protected String extractOption() {
        int indexOf;
        int i4;
        int i5 = this.f86719i;
        if (i5 >= this.patternLength || this.pattern.charAt(i5) != '{' || (indexOf = this.pattern.indexOf(125, this.f86719i)) <= (i4 = this.f86719i)) {
            return null;
        }
        String substring = this.pattern.substring(i4 + 1, indexOf);
        this.f86719i = indexOf + 1;
        return substring;
    }

    protected int extractPrecisionOption() {
        int i4;
        NumberFormatException e4;
        String extractOption = extractOption();
        if (extractOption == null) {
            return 0;
        }
        try {
            i4 = Integer.parseInt(extractOption);
            if (i4 <= 0) {
                try {
                    LogLog.error("Precision option (" + extractOption + ") isn't a positive integer.");
                    return 0;
                } catch (NumberFormatException e5) {
                    e4 = e5;
                    LogLog.error("Category option \"" + extractOption + "\" not a decimal integer.", e4);
                    return i4;
                }
            }
        } catch (NumberFormatException e6) {
            i4 = 0;
            e4 = e6;
        }
        return i4;
    }

    protected void finalizeConverter(char c5) {
        PatternConverter classNamePatternConverter;
        PatternConverter mDCPatternConverter;
        DateFormat dateFormat;
        if (c5 == 'C') {
            classNamePatternConverter = new ClassNamePatternConverter(this.formattingInfo, extractPrecisionOption());
            this.currentLiteral.setLength(0);
        } else if (c5 != 'F') {
            if (c5 == 'X') {
                mDCPatternConverter = new MDCPatternConverter(this.formattingInfo, extractOption());
                this.currentLiteral.setLength(0);
            } else if (c5 == 'p') {
                classNamePatternConverter = new BasicPatternConverter(this.formattingInfo, 2002);
                this.currentLiteral.setLength(0);
            } else if (c5 == 'r') {
                classNamePatternConverter = new BasicPatternConverter(this.formattingInfo, 2000);
                this.currentLiteral.setLength(0);
            } else if (c5 == 't') {
                classNamePatternConverter = new BasicPatternConverter(this.formattingInfo, 2001);
                this.currentLiteral.setLength(0);
            } else if (c5 == 'x') {
                classNamePatternConverter = new BasicPatternConverter(this.formattingInfo, 2003);
                this.currentLiteral.setLength(0);
            } else if (c5 == 'L') {
                classNamePatternConverter = new LocationPatternConverter(this.formattingInfo, 1003);
                this.currentLiteral.setLength(0);
            } else if (c5 == 'M') {
                classNamePatternConverter = new LocationPatternConverter(this.formattingInfo, 1001);
                this.currentLiteral.setLength(0);
            } else if (c5 == 'c') {
                classNamePatternConverter = new CategoryPatternConverter(this.formattingInfo, extractPrecisionOption());
                this.currentLiteral.setLength(0);
            } else if (c5 == 'd') {
                String extractOption = extractOption();
                if (extractOption == null) {
                    extractOption = "ISO8601";
                }
                if (extractOption.equalsIgnoreCase("ISO8601")) {
                    dateFormat = new ISO8601DateFormat();
                } else if (extractOption.equalsIgnoreCase("ABSOLUTE")) {
                    dateFormat = new AbsoluteTimeDateFormat();
                } else if (extractOption.equalsIgnoreCase("DATE")) {
                    dateFormat = new DateTimeDateFormat();
                } else {
                    try {
                        dateFormat = new SimpleDateFormat(extractOption);
                    } catch (IllegalArgumentException e4) {
                        LogLog.error("Could not instantiate SimpleDateFormat with ".concat(extractOption), e4);
                        dateFormat = (DateFormat) OptionConverter.instantiateByClassName("org.apache.log4j.helpers.ISO8601DateFormat", DateFormat.class, null);
                    }
                }
                mDCPatternConverter = new DatePatternConverter(this.formattingInfo, dateFormat);
                this.currentLiteral.setLength(0);
            } else if (c5 == 'l') {
                classNamePatternConverter = new LocationPatternConverter(this.formattingInfo, 1000);
                this.currentLiteral.setLength(0);
            } else if (c5 != 'm') {
                LogLog.error("Unexpected char [" + c5 + "] at position " + this.f86719i + " in conversion patterrn.");
                classNamePatternConverter = new LiteralPatternConverter(this.currentLiteral.toString());
                this.currentLiteral.setLength(0);
            } else {
                classNamePatternConverter = new BasicPatternConverter(this.formattingInfo, 2004);
                this.currentLiteral.setLength(0);
            }
            classNamePatternConverter = mDCPatternConverter;
        } else {
            classNamePatternConverter = new LocationPatternConverter(this.formattingInfo, 1004);
            this.currentLiteral.setLength(0);
        }
        addConverter(classNamePatternConverter);
    }

    public PatternConverter parse() {
        this.f86719i = 0;
        while (true) {
            int i4 = this.f86719i;
            if (i4 >= this.patternLength) {
                break;
            }
            String str = this.pattern;
            this.f86719i = i4 + 1;
            char charAt = str.charAt(i4);
            int i5 = this.state;
            if (i5 == 0) {
                int i6 = this.f86719i;
                if (i6 == this.patternLength) {
                    this.currentLiteral.append(charAt);
                } else if (charAt == '%') {
                    char charAt2 = this.pattern.charAt(i6);
                    if (charAt2 == '%') {
                        this.currentLiteral.append(charAt);
                        this.f86719i++;
                    } else if (charAt2 != 'n') {
                        if (this.currentLiteral.length() != 0) {
                            addToList(new LiteralPatternConverter(this.currentLiteral.toString()));
                        }
                        this.currentLiteral.setLength(0);
                        this.currentLiteral.append(charAt);
                        this.state = 1;
                        this.formattingInfo.reset();
                    } else {
                        this.currentLiteral.append(Layout.LINE_SEP);
                        this.f86719i++;
                    }
                } else {
                    this.currentLiteral.append(charAt);
                }
            } else if (i5 == 1) {
                this.currentLiteral.append(charAt);
                if (charAt == '-') {
                    this.formattingInfo.leftAlign = true;
                } else if (charAt == '.') {
                    this.state = 3;
                } else if (charAt < '0' || charAt > '9') {
                    finalizeConverter(charAt);
                } else {
                    this.formattingInfo.min = charAt - '0';
                    this.state = 4;
                }
            } else if (i5 == 3) {
                this.currentLiteral.append(charAt);
                if (charAt < '0' || charAt > '9') {
                    LogLog.error("Error occured in position " + this.f86719i + ".\n Was expecting digit, instead got char \"" + charAt + "\".");
                    this.state = 0;
                } else {
                    this.formattingInfo.max = charAt - '0';
                    this.state = 5;
                }
            } else if (i5 == 4) {
                this.currentLiteral.append(charAt);
                if (charAt >= '0' && charAt <= '9') {
                    FormattingInfo formattingInfo = this.formattingInfo;
                    formattingInfo.min = (charAt - '0') + (formattingInfo.min * 10);
                } else if (charAt == '.') {
                    this.state = 3;
                } else {
                    finalizeConverter(charAt);
                }
            } else if (i5 == 5) {
                this.currentLiteral.append(charAt);
                if (charAt < '0' || charAt > '9') {
                    finalizeConverter(charAt);
                    this.state = 0;
                } else {
                    FormattingInfo formattingInfo2 = this.formattingInfo;
                    formattingInfo2.max = (charAt - '0') + (formattingInfo2.max * 10);
                }
            }
        }
        if (this.currentLiteral.length() != 0) {
            addToList(new LiteralPatternConverter(this.currentLiteral.toString()));
        }
        return this.head;
    }
}
