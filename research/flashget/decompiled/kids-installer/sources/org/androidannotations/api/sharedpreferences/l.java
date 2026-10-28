package org.androidannotations.api.sharedpreferences;

import android.util.Xml;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: SetXmlSerializer.java */
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final String f31790a = "";

    /* renamed from: b, reason: collision with root package name */
    private static final String f31791b = "AA_string";

    /* renamed from: c, reason: collision with root package name */
    private static final String f31792c = "AA_set";

    private l() {
    }

    public static Set<String> a(String str) {
        TreeSet treeSet = new TreeSet();
        XmlPullParser newPullParser = Xml.newPullParser();
        try {
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            newPullParser.require(2, "", "AA_set");
            while (newPullParser.next() != 3) {
                newPullParser.require(2, "", "AA_string");
                newPullParser.next();
                newPullParser.require(4, null, null);
                treeSet.add(newPullParser.getText());
                newPullParser.next();
                newPullParser.require(3, null, "AA_string");
            }
            return treeSet;
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    public static String b(Set<String> set) {
        if (set == null) {
            set = Collections.emptySet();
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer newSerializer = Xml.newSerializer();
        try {
            newSerializer.setOutput(stringWriter);
            newSerializer.startTag("", "AA_set");
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                newSerializer.startTag("", "AA_string").text(it.next()).endTag("", "AA_string");
            }
            newSerializer.endTag("", "AA_set").endDocument();
        } catch (IOException | IllegalArgumentException | IllegalStateException unused) {
        }
        return stringWriter.toString();
    }
}
