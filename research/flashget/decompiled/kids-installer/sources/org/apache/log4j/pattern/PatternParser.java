package org.apache.log4j.pattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.log4j.helpers.Loader;
import org.apache.log4j.helpers.LogLog;

/* loaded from: classes5.dex */
public final class PatternParser {
    private static final int CONVERTER_STATE = 1;
    private static final int DOT_STATE = 3;
    private static final char ESCAPE_CHAR = '%';
    private static final Map FILENAME_PATTERN_RULES;
    private static final int LITERAL_STATE = 0;
    private static final int MAX_STATE = 5;
    private static final int MIN_STATE = 4;
    private static final Map PATTERN_LAYOUT_RULES;

    private static class ReadOnlyMap implements Map {
        private final Map map;

        public ReadOnlyMap(Map map) {
            this.map = map;
        }

        @Override // java.util.Map
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            return this.map.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return this.map.containsValue(obj);
        }

        @Override // java.util.Map
        public Set entrySet() {
            return this.map.entrySet();
        }

        @Override // java.util.Map
        public Object get(Object obj) {
            return this.map.get(obj);
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return this.map.isEmpty();
        }

        @Override // java.util.Map
        public Set keySet() {
            return this.map.keySet();
        }

        @Override // java.util.Map
        public Object put(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map
        public void putAll(Map map) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map
        public Object remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map
        public int size() {
            return this.map.size();
        }

        @Override // java.util.Map
        public Collection values() {
            return this.map.values();
        }
    }

    static {
        HashMap hashMap = new HashMap(17);
        hashMap.put("c", LoggerPatternConverter.class);
        hashMap.put("logger", LoggerPatternConverter.class);
        hashMap.put("C", ClassNamePatternConverter.class);
        hashMap.put("class", ClassNamePatternConverter.class);
        hashMap.put("d", DatePatternConverter.class);
        hashMap.put("date", DatePatternConverter.class);
        hashMap.put("F", FileLocationPatternConverter.class);
        hashMap.put("file", FileLocationPatternConverter.class);
        hashMap.put("l", FullLocationPatternConverter.class);
        hashMap.put("L", LineLocationPatternConverter.class);
        hashMap.put("line", LineLocationPatternConverter.class);
        hashMap.put("m", MessagePatternConverter.class);
        hashMap.put("message", MessagePatternConverter.class);
        hashMap.put("n", LineSeparatorPatternConverter.class);
        hashMap.put("M", MethodLocationPatternConverter.class);
        hashMap.put("method", MethodLocationPatternConverter.class);
        hashMap.put("p", LevelPatternConverter.class);
        hashMap.put("level", LevelPatternConverter.class);
        hashMap.put("r", RelativeTimePatternConverter.class);
        hashMap.put("relative", RelativeTimePatternConverter.class);
        hashMap.put("t", ThreadPatternConverter.class);
        hashMap.put("thread", ThreadPatternConverter.class);
        hashMap.put("x", NDCPatternConverter.class);
        hashMap.put("ndc", NDCPatternConverter.class);
        hashMap.put("X", PropertiesPatternConverter.class);
        hashMap.put("properties", PropertiesPatternConverter.class);
        hashMap.put("sn", SequenceNumberPatternConverter.class);
        hashMap.put("sequenceNumber", SequenceNumberPatternConverter.class);
        hashMap.put("throwable", ThrowableInformationPatternConverter.class);
        PATTERN_LAYOUT_RULES = new ReadOnlyMap(hashMap);
        HashMap hashMap2 = new HashMap(4);
        hashMap2.put("d", FileDatePatternConverter.class);
        hashMap2.put("date", FileDatePatternConverter.class);
        hashMap2.put("i", IntegerPatternConverter.class);
        hashMap2.put("index", IntegerPatternConverter.class);
        FILENAME_PATTERN_RULES = new ReadOnlyMap(hashMap2);
    }

    private PatternParser() {
    }

    private static PatternConverter createConverter(String str, StringBuffer stringBuffer, Map map, Map map2, List list) {
        Class loadClass;
        String str2 = str;
        Object obj = null;
        for (int length = str.length(); length > 0 && obj == null; length--) {
            str2 = str2.substring(0, length);
            if (map != null) {
                obj = map.get(str2);
            }
            if (obj == null && map2 != null) {
                obj = map2.get(str2);
            }
        }
        if (obj == null) {
            LogLog.error("Unrecognized format specifier [" + str + "]");
            return null;
        }
        if (obj instanceof Class) {
            loadClass = (Class) obj;
        } else {
            if (!(obj instanceof String)) {
                LogLog.warn("Bad map entry for conversion pattern %" + str2 + ".");
                return null;
            }
            try {
                loadClass = Loader.loadClass((String) obj);
            } catch (ClassNotFoundException e6) {
                LogLog.warn("Class for conversion pattern %" + str2 + " not found", e6);
                return null;
            }
        }
        try {
            Object invoke = loadClass.getMethod("newInstance", String[].class).invoke(null, (String[]) list.toArray(new String[list.size()]));
            if (invoke instanceof PatternConverter) {
                stringBuffer.delete(0, stringBuffer.length() - (str.length() - str2.length()));
                return (PatternConverter) invoke;
            }
            LogLog.warn("Class " + loadClass.getName() + " does not extend PatternConverter.");
            return null;
        } catch (Exception e7) {
            LogLog.error("Error creating converter for ".concat(str), e7);
            try {
                PatternConverter patternConverter = (PatternConverter) loadClass.newInstance();
                stringBuffer.delete(0, stringBuffer.length() - (str.length() - str2.length()));
                return patternConverter;
            } catch (Exception e8) {
                LogLog.error("Error creating converter for ".concat(str), e8);
            }
        }
    }

    private static int extractConverter(char c6, String str, int i5, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        stringBuffer.setLength(0);
        if (!Character.isUnicodeIdentifierStart(c6)) {
            return i5;
        }
        stringBuffer.append(c6);
        while (i5 < str.length() && Character.isUnicodeIdentifierPart(str.charAt(i5))) {
            stringBuffer.append(str.charAt(i5));
            stringBuffer2.append(str.charAt(i5));
            i5++;
        }
        return i5;
    }

    private static int extractOptions(String str, int i5, List list) {
        int indexOf;
        while (i5 < str.length() && str.charAt(i5) == '{' && (indexOf = str.indexOf(125, i5)) != -1) {
            list.add(str.substring(i5 + 1, indexOf));
            i5 = indexOf + 1;
        }
        return i5;
    }

    private static int finalizeConverter(char c6, String str, int i5, StringBuffer stringBuffer, FormattingInfo formattingInfo, Map map, Map map2, List list, List list2) {
        StringBuffer stringBuffer2;
        StringBuffer stringBuffer3 = new StringBuffer();
        int extractConverter = extractConverter(c6, str, i5, stringBuffer3, stringBuffer);
        String stringBuffer4 = stringBuffer3.toString();
        ArrayList arrayList = new ArrayList();
        int extractOptions = extractOptions(str, extractConverter, arrayList);
        PatternConverter createConverter = createConverter(stringBuffer4, stringBuffer, map, map2, arrayList);
        if (createConverter == null) {
            if (stringBuffer4 == null || stringBuffer4.length() == 0) {
                stringBuffer2 = new StringBuffer("Empty conversion specifier starting at position ");
            } else {
                stringBuffer2 = new StringBuffer("Unrecognized conversion specifier [");
                stringBuffer2.append(stringBuffer4);
                stringBuffer2.append("] starting at position ");
            }
            stringBuffer2.append(Integer.toString(extractOptions));
            stringBuffer2.append(" in conversion pattern.");
            LogLog.error(stringBuffer2.toString());
            list.add(new LiteralPatternConverter(stringBuffer.toString()));
            list2.add(FormattingInfo.getDefault());
        } else {
            list.add(createConverter);
            list2.add(formattingInfo);
            if (stringBuffer.length() > 0) {
                list.add(new LiteralPatternConverter(stringBuffer.toString()));
                list2.add(FormattingInfo.getDefault());
            }
        }
        stringBuffer.setLength(0);
        return extractOptions;
    }

    public static Map getFileNamePatternRules() {
        return FILENAME_PATTERN_RULES;
    }

    public static Map getPatternLayoutRules() {
        return PATTERN_LAYOUT_RULES;
    }

    public static void parse(String str, List list, List list2, Map map, Map map2) {
        FormattingInfo formattingInfo;
        if (str == null) {
            throw new NullPointerException("pattern");
        }
        StringBuffer stringBuffer = new StringBuffer(32);
        int length = str.length();
        FormattingInfo formattingInfo2 = FormattingInfo.getDefault();
        int i5 = 0;
        char c6 = 0;
        while (i5 < length) {
            int i6 = i5 + 1;
            char charAt = str.charAt(i5);
            char c7 = 1;
            if (c6 == 0) {
                if (i6 == length) {
                    stringBuffer.append(charAt);
                } else if (charAt != '%') {
                    stringBuffer.append(charAt);
                } else if (str.charAt(i6) != '%') {
                    if (stringBuffer.length() != 0) {
                        list.add(new LiteralPatternConverter(stringBuffer.toString()));
                        list2.add(FormattingInfo.getDefault());
                    }
                    stringBuffer.setLength(0);
                    stringBuffer.append(charAt);
                    formattingInfo2 = FormattingInfo.getDefault();
                    i5 = i6;
                    c6 = c7;
                } else {
                    stringBuffer.append(charAt);
                    i5 = i6 + 1;
                }
                i5 = i6;
            } else if (c6 != 1) {
                c7 = 5;
                if (c6 == 3) {
                    stringBuffer.append(charAt);
                    if (charAt < '0' || charAt > '9') {
                        LogLog.error("Error occured in position " + i6 + ".\n Was expecting digit, instead got char \"" + charAt + "\".");
                        i5 = i6;
                    } else {
                        formattingInfo2 = new FormattingInfo(formattingInfo2.isLeftAligned(), formattingInfo2.getMinLength(), charAt - '0');
                        i5 = i6;
                        c6 = c7;
                    }
                } else if (c6 == 4) {
                    stringBuffer.append(charAt);
                    if (charAt >= '0' && charAt <= '9') {
                        formattingInfo = new FormattingInfo(formattingInfo2.isLeftAligned(), (charAt - '0') + (formattingInfo2.getMinLength() * 10), formattingInfo2.getMaxLength());
                        i5 = i6;
                        formattingInfo2 = formattingInfo;
                    } else if (charAt == '.') {
                        i5 = i6;
                        c6 = 3;
                    } else {
                        i5 = finalizeConverter(charAt, str, i6, stringBuffer, formattingInfo2, map, map2, list, list2);
                        formattingInfo2 = FormattingInfo.getDefault();
                        stringBuffer.setLength(0);
                    }
                } else if (c6 != 5) {
                    i5 = i6;
                } else {
                    stringBuffer.append(charAt);
                    if (charAt < '0' || charAt > '9') {
                        i5 = finalizeConverter(charAt, str, i6, stringBuffer, formattingInfo2, map, map2, list, list2);
                        formattingInfo2 = FormattingInfo.getDefault();
                        stringBuffer.setLength(0);
                    } else {
                        formattingInfo = new FormattingInfo(formattingInfo2.isLeftAligned(), formattingInfo2.getMinLength(), (charAt - '0') + (formattingInfo2.getMaxLength() * 10));
                        i5 = i6;
                        formattingInfo2 = formattingInfo;
                    }
                }
                c6 = 0;
            } else {
                stringBuffer.append(charAt);
                if (charAt == '-') {
                    formattingInfo2 = new FormattingInfo(true, formattingInfo2.getMinLength(), formattingInfo2.getMaxLength());
                    i5 = i6;
                } else if (charAt == '.') {
                    i5 = i6;
                    c6 = 3;
                } else if (charAt < '0' || charAt > '9') {
                    i5 = finalizeConverter(charAt, str, i6, stringBuffer, formattingInfo2, map, map2, list, list2);
                    formattingInfo2 = FormattingInfo.getDefault();
                    stringBuffer.setLength(0);
                    c6 = 0;
                } else {
                    formattingInfo2 = new FormattingInfo(formattingInfo2.isLeftAligned(), charAt - '0', formattingInfo2.getMaxLength());
                    i5 = i6;
                    c6 = 4;
                }
            }
        }
        if (stringBuffer.length() != 0) {
            list.add(new LiteralPatternConverter(stringBuffer.toString()));
            list2.add(FormattingInfo.getDefault());
        }
    }
}
