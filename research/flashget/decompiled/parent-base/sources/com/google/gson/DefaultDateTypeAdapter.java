package com.google.gson;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.gson.internal.JavaVersion;
import com.google.gson.internal.PreJava9DateFormatProvider;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes6.dex */
final class DefaultDateTypeAdapter extends TypeAdapter<Date> {
    private static final String SIMPLE_NAME = ProtectedSandApp.s("ր\u0001");
    private final List<DateFormat> dateFormats;
    private final Class<? extends Date> dateType;

    DefaultDateTypeAdapter(Class<? extends Date> cls) {
        ArrayList arrayList = new ArrayList();
        this.dateFormats = arrayList;
        this.dateType = verifyDateType(cls);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (JavaVersion.isJava9OrLater()) {
            arrayList.add(PreJava9DateFormatProvider.getUSDateTimeFormat(2, 2));
        }
    }

    private Date deserializeToDate(String str) {
        synchronized (this.dateFormats) {
            Iterator<DateFormat> it = this.dateFormats.iterator();
            while (it.hasNext()) {
                try {
                    return it.next().parse(str);
                } catch (ParseException unused) {
                }
            }
            try {
                return ISO8601Utils.parse(str, new ParsePosition(0));
            } catch (ParseException e4) {
                throw new JsonSyntaxException(str, e4);
            }
        }
    }

    private static Class<? extends Date> verifyDateType(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ջ\u0001") + Date.class + ProtectedSandApp.s("ռ\u0001") + Timestamp.class + ProtectedSandApp.s("ս\u0001") + java.sql.Date.class + ProtectedSandApp.s("վ\u0001") + cls);
    }

    public String toString() {
        DateFormat dateFormat = this.dateFormats.get(0);
        boolean z4 = dateFormat instanceof SimpleDateFormat;
        String s4 = ProtectedSandApp.s("տ\u0001");
        if (z4) {
            return s4 + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return s4 + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read, reason: avoid collision after fix types in other method */
    public Date read2(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        Date deserializeToDate = deserializeToDate(jsonReader.nextString());
        Class<? extends Date> cls = this.dateType;
        if (cls == Date.class) {
            return deserializeToDate;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(deserializeToDate.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(deserializeToDate.getTime());
        }
        throw new AssertionError();
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Date date) throws IOException {
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this.dateFormats) {
            jsonWriter.value(this.dateFormats.get(0).format(date));
        }
    }

    DefaultDateTypeAdapter(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.dateFormats = arrayList;
        this.dateType = verifyDateType(cls);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    DefaultDateTypeAdapter(Class<? extends Date> cls, int i4) {
        ArrayList arrayList = new ArrayList();
        this.dateFormats = arrayList;
        this.dateType = verifyDateType(cls);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateInstance(i4, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateInstance(i4));
        }
        if (JavaVersion.isJava9OrLater()) {
            arrayList.add(PreJava9DateFormatProvider.getUSDateFormat(i4));
        }
    }

    public DefaultDateTypeAdapter(int i4, int i5) {
        this(Date.class, i4, i5);
    }

    public DefaultDateTypeAdapter(Class<? extends Date> cls, int i4, int i5) {
        ArrayList arrayList = new ArrayList();
        this.dateFormats = arrayList;
        this.dateType = verifyDateType(cls);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i4, i5, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i4, i5));
        }
        if (JavaVersion.isJava9OrLater()) {
            arrayList.add(PreJava9DateFormatProvider.getUSDateTimeFormat(i4, i5));
        }
    }
}
