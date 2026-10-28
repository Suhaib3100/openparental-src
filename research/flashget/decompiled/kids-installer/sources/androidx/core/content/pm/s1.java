package androidx.core.content.pm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import androidx.annotation.c1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ShortcutXmlParser.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class s1 {

    /* renamed from: e, reason: collision with root package name */
    private static volatile ArrayList<String> f4563e;

    /* renamed from: a, reason: collision with root package name */
    private static final String f4559a = "ShortcutXmlParser";

    /* renamed from: b, reason: collision with root package name */
    private static final String f4560b = "android.app.shortcuts";

    /* renamed from: c, reason: collision with root package name */
    private static final String f4561c = "shortcut";

    /* renamed from: d, reason: collision with root package name */
    private static final String f4562d = "shortcutId";

    /* renamed from: f, reason: collision with root package name */
    private static final Object f4564f = new Object();

    private s1() {
    }

    private static String a(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlPullParser.getAttributeValue(null, str) : attributeValue;
    }

    @androidx.annotation.n1
    @androidx.annotation.o0
    public static List<String> b(@androidx.annotation.o0 Context context) {
        if (f4563e == null) {
            synchronized (f4564f) {
                if (f4563e == null) {
                    f4563e = new ArrayList<>();
                    f4563e.addAll(e(context));
                }
            }
        }
        return f4563e;
    }

    @androidx.annotation.o0
    private static XmlResourceParser c(Context context, ActivityInfo activityInfo) {
        XmlResourceParser loadXmlMetaData = activityInfo.loadXmlMetaData(context.getPackageManager(), "android.app.shortcuts");
        if (loadXmlMetaData != null) {
            return loadXmlMetaData;
        }
        throw new IllegalArgumentException("Failed to open android.app.shortcuts meta-data resource of " + activityInfo.name);
    }

    @androidx.annotation.o0
    @androidx.annotation.m1
    public static List<String> d(@androidx.annotation.o0 XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String a6;
        ArrayList arrayList = new ArrayList(1);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= 0)) {
                break;
            }
            int depth = xmlPullParser.getDepth();
            String name = xmlPullParser.getName();
            if (next == 2 && depth == 2 && "shortcut".equals(name) && (a6 = a(xmlPullParser, "shortcutId")) != null) {
                arrayList.add(a6);
            }
        }
        return arrayList;
    }

    @androidx.annotation.o0
    private static Set<String> e(@androidx.annotation.o0 Context context) {
        HashSet hashSet = new HashSet();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
        if (queryIntentActivities != null && queryIntentActivities.size() != 0) {
            try {
                Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                while (it.hasNext()) {
                    ActivityInfo activityInfo = it.next().activityInfo;
                    Bundle bundle = activityInfo.metaData;
                    if (bundle != null && bundle.containsKey("android.app.shortcuts")) {
                        XmlResourceParser c6 = c(context, activityInfo);
                        try {
                            hashSet.addAll(d(c6));
                            if (c6 != null) {
                                c6.close();
                            }
                        } finally {
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return hashSet;
    }
}
