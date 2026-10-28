package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.Base64;
import android.util.JsonReader;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: CrashlyticsReportJsonTransform.java */
/* loaded from: classes6.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.encoders.a f59358a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CrashlyticsReportJsonTransform.java */
    interface a<T> {
        T a(@o0 JsonReader jsonReader) throws IOException;
    }

    static {
        com.google.firebase.encoders.json.e eVar = new com.google.firebase.encoders.json.e();
        com.google.firebase.crashlytics.internal.model.a.f58979b.a(eVar);
        f59358a = eVar.l(true).j();
    }

    @o0
    private static g0.f.d.AbstractC0916d A(@o0 JsonReader jsonReader) throws IOException {
        g0.f.d.AbstractC0916d.a a5 = g0.f.d.AbstractC0916d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals(ProtectedSandApp.s("ﻒ"))) {
                a5.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a5.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public static g0.f.d.e B(@o0 JsonReader jsonReader) throws IOException {
        g0.f.d.e.a a5 = g0.f.d.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c5 = 65535;
            switch (nextName.hashCode()) {
                case -1536268810:
                    if (nextName.equals(ProtectedSandApp.s("ﻖ"))) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -1027290370:
                    if (nextName.equals(ProtectedSandApp.s("ﻕ"))) {
                        c5 = 1;
                        break;
                    }
                    break;
                case 1098747284:
                    if (nextName.equals(ProtectedSandApp.s("ﻔ"))) {
                        c5 = 2;
                        break;
                    }
                    break;
                case 1124454216:
                    if (nextName.equals(ProtectedSandApp.s("ﻓ"))) {
                        c5 = 3;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    a5.b(jsonReader.nextString());
                    break;
                case 1:
                    a5.e(jsonReader.nextLong());
                    break;
                case 2:
                    a5.d(K(jsonReader));
                    break;
                case 3:
                    a5.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a5.a();
    }

    @o0
    private static g0.f.d.AbstractC0917f C(@o0 JsonReader jsonReader) throws IOException {
        g0.f.d.AbstractC0917f.a a5 = g0.f.d.AbstractC0917f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals(ProtectedSandApp.s("ﻗ"))) {
                a5.b(p(jsonReader, new i()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a5.a();
    }

    @o0
    private static g0.f.d.a.b.AbstractC0910d D(@o0 JsonReader jsonReader) throws IOException {
        g0.f.d.a.b.AbstractC0910d.AbstractC0911a a5 = g0.f.d.a.b.AbstractC0910d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c5 = 65535;
            switch (nextName.hashCode()) {
                case -1147692044:
                    if (nextName.equals(ProtectedSandApp.s("ﻚ"))) {
                        c5 = 0;
                        break;
                    }
                    break;
                case 3059181:
                    if (nextName.equals(ProtectedSandApp.s("ﻙ"))) {
                        c5 = 1;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals(ProtectedSandApp.s("ﻘ"))) {
                        c5 = 2;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    a5.b(jsonReader.nextLong());
                    break;
                case 1:
                    a5.c(jsonReader.nextString());
                    break;
                case 2:
                    a5.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a5.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public static g0.f.d.a.b.e E(@o0 JsonReader jsonReader) throws IOException {
        g0.f.d.a.b.e.AbstractC0912a a5 = g0.f.d.a.b.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c5 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals(ProtectedSandApp.s("ﻜ"))) {
                        c5 = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals(ProtectedSandApp.s("ﻘ"))) {
                        c5 = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals(ProtectedSandApp.s("ﻛ"))) {
                        c5 = 2;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    a5.b(p(jsonReader, new com.google.firebase.crashlytics.internal.model.serialization.a()));
                    break;
                case 1:
                    a5.d(jsonReader.nextString());
                    break;
                case 2:
                    a5.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a5.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public static g0.e.b F(@o0 JsonReader jsonReader) throws IOException {
        g0.e.b.a a5 = g0.e.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals(ProtectedSandApp.s("ﻝ"))) {
                a5.c(jsonReader.nextString());
            } else if (nextName.equals(ProtectedSandApp.s("ﻞ"))) {
                a5.b(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a5.a();
    }

    @o0
    private static g0.e G(@o0 JsonReader jsonReader) throws IOException {
        g0.e.a a5 = g0.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals(ProtectedSandApp.s("ﻟ"))) {
                a5.b(p(jsonReader, new h()));
            } else if (nextName.equals(ProtectedSandApp.s("ﻠ"))) {
                a5.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a5.a();
    }

    @o0
    private static g0.f.e H(@o0 JsonReader jsonReader) throws IOException {
        g0.f.e.a a5 = g0.f.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c5 = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals(ProtectedSandApp.s("ﻤ"))) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals(ProtectedSandApp.s("ﻣ"))) {
                        c5 = 1;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals(ProtectedSandApp.s("ﻢ"))) {
                        c5 = 2;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals(ProtectedSandApp.s("ﻡ"))) {
                        c5 = 3;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    a5.b(jsonReader.nextString());
                    break;
                case 1:
                    a5.c(jsonReader.nextBoolean());
                    break;
                case 2:
                    a5.e(jsonReader.nextString());
                    break;
                case 3:
                    a5.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a5.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public static g0.f.d.a.c I(@o0 JsonReader jsonReader) throws IOException {
        g0.f.d.a.c.AbstractC0915a a5 = g0.f.d.a.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c5 = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals(ProtectedSandApp.s("ﻧ"))) {
                        c5 = 0;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals(ProtectedSandApp.s("ﻦ"))) {
                        c5 = 1;
                        break;
                    }
                    break;
                case 1694598382:
                    if (nextName.equals(ProtectedSandApp.s("ﻥ"))) {
                        c5 = 2;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals(ProtectedSandApp.s("ﻛ"))) {
                        c5 = 3;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    a5.d(jsonReader.nextInt());
                    break;
                case 1:
                    a5.e(jsonReader.nextString());
                    break;
                case 2:
                    a5.b(jsonReader.nextBoolean());
                    break;
                case 3:
                    a5.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a5.a();
    }

    @o0
    private static g0 J(@o0 JsonReader jsonReader) throws IOException {
        g0.c b5 = g0.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c5 = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals(ProtectedSandApp.s("ﻱ"))) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals(ProtectedSandApp.s("ﻰ"))) {
                        c5 = 1;
                        break;
                    }
                    break;
                case -1907185581:
                    if (nextName.equals(ProtectedSandApp.s("ﻯ"))) {
                        c5 = 2;
                        break;
                    }
                    break;
                case -1375141843:
                    if (nextName.equals(ProtectedSandApp.s("ﻮ"))) {
                        c5 = 3;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals(ProtectedSandApp.s("ﻤ"))) {
                        c5 = 4;
                        break;
                    }
                    break;
                case -401988390:
                    if (nextName.equals(ProtectedSandApp.s("ﻭ"))) {
                        c5 = 5;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals(ProtectedSandApp.s("ﻬ"))) {
                        c5 = 6;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals(ProtectedSandApp.s("ﻫ"))) {
                        c5 = 7;
                        break;
                    }
                    break;
                case 1047652060:
                    if (nextName.equals(ProtectedSandApp.s("ﻪ"))) {
                        c5 = '\b';
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals(ProtectedSandApp.s("ﻡ"))) {
                        c5 = '\t';
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals(ProtectedSandApp.s("ﻩ"))) {
                        c5 = '\n';
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals(ProtectedSandApp.s("ﻨ"))) {
                        c5 = 11;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    b5.j(G(jsonReader));
                    break;
                case 1:
                    b5.l(jsonReader.nextString());
                    break;
                case 2:
                    b5.c(jsonReader.nextString());
                    break;
                case 3:
                    b5.b(o(jsonReader));
                    break;
                case 4:
                    b5.d(jsonReader.nextString());
                    break;
                case 5:
                    b5.f(jsonReader.nextString());
                    break;
                case 6:
                    b5.h(jsonReader.nextString());
                    break;
                case 7:
                    b5.i(jsonReader.nextString());
                    break;
                case '\b':
                    b5.g(jsonReader.nextString());
                    break;
                case '\t':
                    b5.k(jsonReader.nextInt());
                    break;
                case '\n':
                    b5.e(jsonReader.nextString());
                    break;
                case 11:
                    b5.m(L(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b5.a();
    }

    @o0
    private static g0.f.d.e.b K(@o0 JsonReader jsonReader) throws IOException {
        g0.f.d.e.b.a a5 = g0.f.d.e.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals(ProtectedSandApp.s("ﻲ"))) {
                a5.c(jsonReader.nextString());
            } else if (nextName.equals(ProtectedSandApp.s("ﻳ"))) {
                a5.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a5.a();
    }

    @o0
    private static g0.f L(@o0 JsonReader jsonReader) throws IOException {
        g0.f.b a5 = g0.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c5 = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals(ProtectedSandApp.s("\ufefe"))) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -1907185581:
                    if (nextName.equals(ProtectedSandApp.s("ﻯ"))) {
                        c5 = 1;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals(ProtectedSandApp.s("\ufefd"))) {
                        c5 = 2;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals(ProtectedSandApp.s("ﻼ"))) {
                        c5 = 3;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals(ProtectedSandApp.s("ﻻ"))) {
                        c5 = 4;
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals(ProtectedSandApp.s("ﻺ"))) {
                        c5 = 5;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals(ProtectedSandApp.s("ﻹ"))) {
                        c5 = 6;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals(ProtectedSandApp.s("ﻸ"))) {
                        c5 = 7;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals(ProtectedSandApp.s("ﻷ"))) {
                        c5 = '\b';
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals(ProtectedSandApp.s("ﻶ"))) {
                        c5 = '\t';
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals(ProtectedSandApp.s("ﻵ"))) {
                        c5 = '\n';
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals(ProtectedSandApp.s("ﻴ"))) {
                        c5 = 11;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    a5.m(jsonReader.nextLong());
                    break;
                case 1:
                    a5.c(jsonReader.nextString());
                    break;
                case 2:
                    a5.k(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    a5.f(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 4:
                    a5.e(s(jsonReader));
                    break;
                case 5:
                    a5.g(p(jsonReader, new e()));
                    break;
                case 6:
                    a5.l(H(jsonReader));
                    break;
                case 7:
                    a5.b(n(jsonReader));
                    break;
                case '\b':
                    a5.n(M(jsonReader));
                    break;
                case '\t':
                    a5.h(jsonReader.nextString());
                    break;
                case '\n':
                    a5.d(jsonReader.nextBoolean());
                    break;
                case 11:
                    a5.i(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a5.a();
    }

    @o0
    private static g0.f.AbstractC0918f M(@o0 JsonReader jsonReader) throws IOException {
        g0.f.AbstractC0918f.a a5 = g0.f.AbstractC0918f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals(ProtectedSandApp.s("\ufefd"))) {
                a5.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a5.a();
    }

    @o0
    private static g0.f.a n(@o0 JsonReader jsonReader) throws IOException {
        g0.f.a.AbstractC0903a a5 = g0.f.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c5 = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals(ProtectedSandApp.s("\ufefd"))) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -519438642:
                    if (nextName.equals(ProtectedSandApp.s("\uff00"))) {
                        c5 = 1;
                        break;
                    }
                    break;
                case 213652010:
                    if (nextName.equals(ProtectedSandApp.s("\ufeff"))) {
                        c5 = 2;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals(ProtectedSandApp.s("ﻢ"))) {
                        c5 = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals(ProtectedSandApp.s("ﻫ"))) {
                        c5 = 4;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals(ProtectedSandApp.s("ﻩ"))) {
                        c5 = 5;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    a5.e(jsonReader.nextString());
                    break;
                case 1:
                    a5.b(jsonReader.nextString());
                    break;
                case 2:
                    a5.c(jsonReader.nextString());
                    break;
                case 3:
                    a5.h(jsonReader.nextString());
                    break;
                case 4:
                    a5.f(jsonReader.nextString());
                    break;
                case 5:
                    a5.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a5.a();
    }

    @o0
    private static g0.a o(@o0 JsonReader jsonReader) throws IOException {
        g0.a.b a5 = g0.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c5 = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals(ProtectedSandApp.s("＆"))) {
                        c5 = 0;
                        break;
                    }
                    break;
                case 110987:
                    if (nextName.equals(ProtectedSandApp.s("ﻧ"))) {
                        c5 = 1;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals(ProtectedSandApp.s("％"))) {
                        c5 = 2;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals(ProtectedSandApp.s("＄"))) {
                        c5 = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals(ProtectedSandApp.s("＃"))) {
                        c5 = 4;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals(ProtectedSandApp.s("ﻦ"))) {
                        c5 = 5;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals(ProtectedSandApp.s("＂"))) {
                        c5 = 6;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals(ProtectedSandApp.s("！"))) {
                        c5 = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals(ProtectedSandApp.s("ﻛ"))) {
                        c5 = '\b';
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    a5.b(p(jsonReader, new b()));
                    break;
                case 1:
                    a5.d(jsonReader.nextInt());
                    break;
                case 2:
                    a5.f(jsonReader.nextLong());
                    break;
                case 3:
                    a5.h(jsonReader.nextLong());
                    break;
                case 4:
                    a5.i(jsonReader.nextLong());
                    break;
                case 5:
                    a5.e(jsonReader.nextString());
                    break;
                case 6:
                    a5.g(jsonReader.nextInt());
                    break;
                case 7:
                    a5.j(jsonReader.nextString());
                    break;
                case '\b':
                    a5.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a5.a();
    }

    @o0
    private static <T> List<T> p(@o0 JsonReader jsonReader, @o0 a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public static g0.a.AbstractC0901a q(@o0 JsonReader jsonReader) throws IOException {
        g0.a.AbstractC0901a.AbstractC0902a a5 = g0.a.AbstractC0901a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c5 = 65535;
            switch (nextName.hashCode()) {
                case -609862170:
                    if (nextName.equals(ProtectedSandApp.s("）"))) {
                        c5 = 0;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals(ProtectedSandApp.s("（"))) {
                        c5 = 1;
                        break;
                    }
                    break;
                case 230943785:
                    if (nextName.equals(ProtectedSandApp.s("＇"))) {
                        c5 = 2;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    a5.d(jsonReader.nextString());
                    break;
                case 1:
                    a5.b(jsonReader.nextString());
                    break;
                case 2:
                    a5.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a5.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public static g0.d r(@o0 JsonReader jsonReader) throws IOException {
        g0.d.a a5 = g0.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals(ProtectedSandApp.s("＊"))) {
                a5.b(jsonReader.nextString());
            } else if (nextName.equals(ProtectedSandApp.s("＋"))) {
                a5.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a5.a();
    }

    @o0
    private static g0.f.c s(@o0 JsonReader jsonReader) throws IOException {
        g0.f.c.a a5 = g0.f.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c5 = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals(ProtectedSandApp.s("３"))) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals(ProtectedSandApp.s("２"))) {
                        c5 = 1;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals(ProtectedSandApp.s("１"))) {
                        c5 = 2;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals(ProtectedSandApp.s("（"))) {
                        c5 = 3;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals(ProtectedSandApp.s("０"))) {
                        c5 = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals(ProtectedSandApp.s("／"))) {
                        c5 = 5;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals(ProtectedSandApp.s("．"))) {
                        c5 = 6;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals(ProtectedSandApp.s("－"))) {
                        c5 = 7;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals(ProtectedSandApp.s("，"))) {
                        c5 = '\b';
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    a5.i(jsonReader.nextBoolean());
                    break;
                case 1:
                    a5.e(jsonReader.nextString());
                    break;
                case 2:
                    a5.h(jsonReader.nextLong());
                    break;
                case 3:
                    a5.b(jsonReader.nextInt());
                    break;
                case 4:
                    a5.d(jsonReader.nextLong());
                    break;
                case 5:
                    a5.c(jsonReader.nextInt());
                    break;
                case 6:
                    a5.f(jsonReader.nextString());
                    break;
                case 7:
                    a5.j(jsonReader.nextInt());
                    break;
                case '\b':
                    a5.g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a5.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public static g0.f.d t(@o0 JsonReader jsonReader) throws IOException {
        g0.f.d.b a5 = g0.f.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c5 = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals(ProtectedSandApp.s("ﻻ"))) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -259312414:
                    if (nextName.equals(ProtectedSandApp.s("６"))) {
                        c5 = 1;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals(ProtectedSandApp.s("ﻸ"))) {
                        c5 = 2;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals(ProtectedSandApp.s("５"))) {
                        c5 = 3;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals(ProtectedSandApp.s("４"))) {
                        c5 = 4;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals(ProtectedSandApp.s("＃"))) {
                        c5 = 5;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    a5.c(w(jsonReader));
                    break;
                case 1:
                    a5.e(C(jsonReader));
                    break;
                case 2:
                    a5.b(u(jsonReader));
                    break;
                case 3:
                    a5.d(A(jsonReader));
                    break;
                case 4:
                    a5.g(jsonReader.nextString());
                    break;
                case 5:
                    a5.f(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a5.a();
    }

    @o0
    private static g0.f.d.a u(@o0 JsonReader jsonReader) throws IOException {
        g0.f.d.a.AbstractC0905a a5 = g0.f.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c5 = 65535;
            switch (nextName.hashCode()) {
                case -1405314732:
                    if (nextName.equals(ProtectedSandApp.s("＝"))) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -1332194002:
                    if (nextName.equals(ProtectedSandApp.s("＜"))) {
                        c5 = 1;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals(ProtectedSandApp.s("；"))) {
                        c5 = 2;
                        break;
                    }
                    break;
                case -80231855:
                    if (nextName.equals(ProtectedSandApp.s("："))) {
                        c5 = 3;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals(ProtectedSandApp.s("９"))) {
                        c5 = 4;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals(ProtectedSandApp.s("８"))) {
                        c5 = 5;
                        break;
                    }
                    break;
                case 1847730860:
                    if (nextName.equals(ProtectedSandApp.s("７"))) {
                        c5 = 6;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    a5.b(p(jsonReader, new d()));
                    break;
                case 1:
                    a5.c(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case 2:
                    a5.f(x(jsonReader));
                    break;
                case 3:
                    a5.g(p(jsonReader, new c()));
                    break;
                case 4:
                    a5.e(p(jsonReader, new c()));
                    break;
                case 5:
                    a5.h(jsonReader.nextInt());
                    break;
                case 6:
                    a5.d(I(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a5.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public static g0.f.d.a.b.AbstractC0906a v(@o0 JsonReader jsonReader) throws IOException {
        g0.f.d.a.b.AbstractC0906a.AbstractC0907a a5 = g0.f.d.a.b.AbstractC0906a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c5 = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals(ProtectedSandApp.s("ﻘ"))) {
                        c5 = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals(ProtectedSandApp.s("＠"))) {
                        c5 = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals(ProtectedSandApp.s("？"))) {
                        c5 = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals(ProtectedSandApp.s("＞"))) {
                        c5 = 3;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    a5.c(jsonReader.nextString());
                    break;
                case 1:
                    a5.d(jsonReader.nextLong());
                    break;
                case 2:
                    a5.f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    a5.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a5.a();
    }

    @o0
    private static g0.f.d.c w(@o0 JsonReader jsonReader) throws IOException {
        g0.f.d.c.a a5 = g0.f.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c5 = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals(ProtectedSandApp.s("Ｆ"))) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals(ProtectedSandApp.s("Ｅ"))) {
                        c5 = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals(ProtectedSandApp.s("Ｄ"))) {
                        c5 = 2;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals(ProtectedSandApp.s("Ｃ"))) {
                        c5 = 3;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals(ProtectedSandApp.s("Ｂ"))) {
                        c5 = 4;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals(ProtectedSandApp.s("Ａ"))) {
                        c5 = 5;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    a5.b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case 1:
                    a5.c(jsonReader.nextInt());
                    break;
                case 2:
                    a5.e(jsonReader.nextInt());
                    break;
                case 3:
                    a5.d(jsonReader.nextLong());
                    break;
                case 4:
                    a5.g(jsonReader.nextLong());
                    break;
                case 5:
                    a5.f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a5.a();
    }

    @o0
    private static g0.f.d.a.b x(@o0 JsonReader jsonReader) throws IOException {
        g0.f.d.a.b.AbstractC0908b a5 = g0.f.d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c5 = 65535;
            switch (nextName.hashCode()) {
                case -1375141843:
                    if (nextName.equals(ProtectedSandApp.s("ﻮ"))) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -1337936983:
                    if (nextName.equals(ProtectedSandApp.s("Ｊ"))) {
                        c5 = 1;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals(ProtectedSandApp.s("Ｉ"))) {
                        c5 = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals(ProtectedSandApp.s("Ｈ"))) {
                        c5 = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals(ProtectedSandApp.s("Ｇ"))) {
                        c5 = 4;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    a5.b(o(jsonReader));
                    break;
                case 1:
                    a5.f(p(jsonReader, new f()));
                    break;
                case 2:
                    a5.e(D(jsonReader));
                    break;
                case 3:
                    a5.c(p(jsonReader, new g()));
                    break;
                case 4:
                    a5.d(y(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a5.a();
    }

    @o0
    private static g0.f.d.a.b.c y(@o0 JsonReader jsonReader) throws IOException {
        g0.f.d.a.b.c.AbstractC0909a a5 = g0.f.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c5 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals(ProtectedSandApp.s("ﻜ"))) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals(ProtectedSandApp.s("Ｍ"))) {
                        c5 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals(ProtectedSandApp.s("４"))) {
                        c5 = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals(ProtectedSandApp.s("Ｌ"))) {
                        c5 = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals(ProtectedSandApp.s("Ｋ"))) {
                        c5 = 4;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    a5.c(p(jsonReader, new com.google.firebase.crashlytics.internal.model.serialization.a()));
                    break;
                case 1:
                    a5.e(jsonReader.nextString());
                    break;
                case 2:
                    a5.f(jsonReader.nextString());
                    break;
                case 3:
                    a5.b(y(jsonReader));
                    break;
                case 4:
                    a5.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a5.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public static g0.f.d.a.b.e.AbstractC0913b z(@o0 JsonReader jsonReader) throws IOException {
        g0.f.d.a.b.e.AbstractC0913b.AbstractC0914a a5 = g0.f.d.a.b.e.AbstractC0913b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c5 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals(ProtectedSandApp.s("Ｑ"))) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals(ProtectedSandApp.s("Ｐ"))) {
                        c5 = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals(ProtectedSandApp.s("Ｏ"))) {
                        c5 = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals(ProtectedSandApp.s("Ｎ"))) {
                        c5 = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals(ProtectedSandApp.s("ﻛ"))) {
                        c5 = 4;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    a5.d(jsonReader.nextLong());
                    break;
                case 1:
                    a5.f(jsonReader.nextString());
                    break;
                case 2:
                    a5.e(jsonReader.nextLong());
                    break;
                case 3:
                    a5.b(jsonReader.nextString());
                    break;
                case 4:
                    a5.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a5.a();
    }

    @o0
    public g0 N(@o0 String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                g0 J = J(jsonReader);
                jsonReader.close();
                return J;
            } finally {
            }
        } catch (IllegalStateException e4) {
            throw new IOException(e4);
        }
    }

    @o0
    public String O(@o0 g0 g0Var) {
        return f59358a.a(g0Var);
    }

    @o0
    public g0.a j(@o0 String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                g0.a o4 = o(jsonReader);
                jsonReader.close();
                return o4;
            } finally {
            }
        } catch (IllegalStateException e4) {
            throw new IOException(e4);
        }
    }

    @o0
    public String k(@o0 g0.a aVar) {
        return f59358a.a(aVar);
    }

    @o0
    public g0.f.d l(@o0 String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                g0.f.d t4 = t(jsonReader);
                jsonReader.close();
                return t4;
            } finally {
            }
        } catch (IllegalStateException e4) {
            throw new IOException(e4);
        }
    }

    @o0
    public String m(@o0 g0.f.d dVar) {
        return f59358a.a(dVar);
    }
}
