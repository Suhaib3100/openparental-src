package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.Base64;
import android.util.JsonReader;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: CrashlyticsReportJsonTransform.java */
/* loaded from: classes2.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.encoders.a f16241a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CrashlyticsReportJsonTransform.java */
    interface a<T> {
        T a(@o0 JsonReader jsonReader) throws IOException;
    }

    static {
        com.google.firebase.encoders.json.e eVar = new com.google.firebase.encoders.json.e();
        com.google.firebase.crashlytics.internal.model.a.f15873b.a(eVar);
        f16241a = eVar.l(true).j();
    }

    @o0
    private static f0.f.d.AbstractC0213d A(@o0 JsonReader jsonReader) throws IOException {
        f0.f.d.AbstractC0213d.a a6 = f0.f.d.AbstractC0213d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals(ProtectedSandApp.s("ᔓ"))) {
                a6.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a6.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public static f0.f.d.e B(@o0 JsonReader jsonReader) throws IOException {
        f0.f.d.e.a a6 = f0.f.d.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c6 = 65535;
            switch (nextName.hashCode()) {
                case -1536268810:
                    if (nextName.equals(ProtectedSandApp.s("ᔗ"))) {
                        c6 = 0;
                        break;
                    }
                    break;
                case -1027290370:
                    if (nextName.equals(ProtectedSandApp.s("ᔖ"))) {
                        c6 = 1;
                        break;
                    }
                    break;
                case 1098747284:
                    if (nextName.equals(ProtectedSandApp.s("ᔕ"))) {
                        c6 = 2;
                        break;
                    }
                    break;
                case 1124454216:
                    if (nextName.equals(ProtectedSandApp.s("ᔔ"))) {
                        c6 = 3;
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    a6.b(jsonReader.nextString());
                    break;
                case 1:
                    a6.e(jsonReader.nextLong());
                    break;
                case 2:
                    a6.d(K(jsonReader));
                    break;
                case 3:
                    a6.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a6.a();
    }

    @o0
    private static f0.f.d.AbstractC0214f C(@o0 JsonReader jsonReader) throws IOException {
        f0.f.d.AbstractC0214f.a a6 = f0.f.d.AbstractC0214f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals(ProtectedSandApp.s("ᔘ"))) {
                a6.b(p(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.model.serialization.f
                    @Override // com.google.firebase.crashlytics.internal.model.serialization.j.a
                    public final Object a(JsonReader jsonReader2) {
                        f0.f.d.e B;
                        B = j.B(jsonReader2);
                        return B;
                    }
                }));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a6.a();
    }

    @o0
    private static f0.f.d.a.b.AbstractC0207d D(@o0 JsonReader jsonReader) throws IOException {
        f0.f.d.a.b.AbstractC0207d.AbstractC0208a a6 = f0.f.d.a.b.AbstractC0207d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c6 = 65535;
            switch (nextName.hashCode()) {
                case -1147692044:
                    if (nextName.equals(ProtectedSandApp.s("ᔛ"))) {
                        c6 = 0;
                        break;
                    }
                    break;
                case 3059181:
                    if (nextName.equals(ProtectedSandApp.s("ᔚ"))) {
                        c6 = 1;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals(ProtectedSandApp.s("ᔙ"))) {
                        c6 = 2;
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    a6.b(jsonReader.nextLong());
                    break;
                case 1:
                    a6.c(jsonReader.nextString());
                    break;
                case 2:
                    a6.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a6.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public static f0.f.d.a.b.e E(@o0 JsonReader jsonReader) throws IOException {
        f0.f.d.a.b.e.AbstractC0209a a6 = f0.f.d.a.b.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c6 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals(ProtectedSandApp.s("ᔞ"))) {
                        c6 = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals(ProtectedSandApp.s("ᔝ"))) {
                        c6 = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals(ProtectedSandApp.s("ᔜ"))) {
                        c6 = 2;
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    a6.b(p(jsonReader, new com.google.firebase.crashlytics.internal.model.serialization.a()));
                    break;
                case 1:
                    a6.d(jsonReader.nextString());
                    break;
                case 2:
                    a6.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a6.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public static f0.e.b F(@o0 JsonReader jsonReader) throws IOException {
        f0.e.b.a a6 = f0.e.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals(ProtectedSandApp.s("ᔟ"))) {
                a6.c(jsonReader.nextString());
            } else if (nextName.equals(ProtectedSandApp.s("ᔠ"))) {
                a6.b(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a6.a();
    }

    @o0
    private static f0.e G(@o0 JsonReader jsonReader) throws IOException {
        f0.e.a a6 = f0.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals(ProtectedSandApp.s("ᔡ"))) {
                a6.b(p(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.model.serialization.e
                    @Override // com.google.firebase.crashlytics.internal.model.serialization.j.a
                    public final Object a(JsonReader jsonReader2) {
                        f0.e.b F;
                        F = j.F(jsonReader2);
                        return F;
                    }
                }));
            } else if (nextName.equals(ProtectedSandApp.s("ᔢ"))) {
                a6.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a6.a();
    }

    @o0
    private static f0.f.e H(@o0 JsonReader jsonReader) throws IOException {
        f0.f.e.a a6 = f0.f.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c6 = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals(ProtectedSandApp.s("ᔦ"))) {
                        c6 = 0;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals(ProtectedSandApp.s("ᔥ"))) {
                        c6 = 1;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals(ProtectedSandApp.s("ᔤ"))) {
                        c6 = 2;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals(ProtectedSandApp.s("ᔣ"))) {
                        c6 = 3;
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    a6.b(jsonReader.nextString());
                    break;
                case 1:
                    a6.c(jsonReader.nextBoolean());
                    break;
                case 2:
                    a6.e(jsonReader.nextString());
                    break;
                case 3:
                    a6.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a6.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public static f0.f.d.a.c I(@o0 JsonReader jsonReader) throws IOException {
        f0.f.d.a.c.AbstractC0212a a6 = f0.f.d.a.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c6 = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals(ProtectedSandApp.s("ᔪ"))) {
                        c6 = 0;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals(ProtectedSandApp.s("ᔩ"))) {
                        c6 = 1;
                        break;
                    }
                    break;
                case 1694598382:
                    if (nextName.equals(ProtectedSandApp.s("ᔨ"))) {
                        c6 = 2;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals(ProtectedSandApp.s("ᔧ"))) {
                        c6 = 3;
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    a6.d(jsonReader.nextInt());
                    break;
                case 1:
                    a6.e(jsonReader.nextString());
                    break;
                case 2:
                    a6.b(jsonReader.nextBoolean());
                    break;
                case 3:
                    a6.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a6.a();
    }

    @o0
    private static f0 J(@o0 JsonReader jsonReader) throws IOException {
        f0.c b6 = f0.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c6 = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals(ProtectedSandApp.s("ᔵ"))) {
                        c6 = 0;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals(ProtectedSandApp.s("ᔴ"))) {
                        c6 = 1;
                        break;
                    }
                    break;
                case -1907185581:
                    if (nextName.equals(ProtectedSandApp.s("ᔳ"))) {
                        c6 = 2;
                        break;
                    }
                    break;
                case -1375141843:
                    if (nextName.equals(ProtectedSandApp.s("ᔲ"))) {
                        c6 = 3;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals(ProtectedSandApp.s("ᔱ"))) {
                        c6 = 4;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals(ProtectedSandApp.s("ᔰ"))) {
                        c6 = 5;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals(ProtectedSandApp.s("ᔯ"))) {
                        c6 = 6;
                        break;
                    }
                    break;
                case 1047652060:
                    if (nextName.equals(ProtectedSandApp.s("ᔮ"))) {
                        c6 = 7;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals(ProtectedSandApp.s("ᔭ"))) {
                        c6 = '\b';
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals(ProtectedSandApp.s("ᔬ"))) {
                        c6 = '\t';
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals(ProtectedSandApp.s("ᔫ"))) {
                        c6 = '\n';
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    b6.i(G(jsonReader));
                    break;
                case 1:
                    b6.k(jsonReader.nextString());
                    break;
                case 2:
                    b6.c(jsonReader.nextString());
                    break;
                case 3:
                    b6.b(o(jsonReader));
                    break;
                case 4:
                    b6.d(jsonReader.nextString());
                    break;
                case 5:
                    b6.g(jsonReader.nextString());
                    break;
                case 6:
                    b6.h(jsonReader.nextString());
                    break;
                case 7:
                    b6.f(jsonReader.nextString());
                    break;
                case '\b':
                    b6.j(jsonReader.nextInt());
                    break;
                case '\t':
                    b6.e(jsonReader.nextString());
                    break;
                case '\n':
                    b6.l(L(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b6.a();
    }

    @o0
    private static f0.f.d.e.b K(@o0 JsonReader jsonReader) throws IOException {
        f0.f.d.e.b.a a6 = f0.f.d.e.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals(ProtectedSandApp.s("ᔶ"))) {
                a6.c(jsonReader.nextString());
            } else if (nextName.equals(ProtectedSandApp.s("ᔷ"))) {
                a6.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a6.a();
    }

    @o0
    private static f0.f L(@o0 JsonReader jsonReader) throws IOException {
        f0.f.b a6 = f0.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c6 = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals(ProtectedSandApp.s("ᕃ"))) {
                        c6 = 0;
                        break;
                    }
                    break;
                case -1907185581:
                    if (nextName.equals(ProtectedSandApp.s("ᕂ"))) {
                        c6 = 1;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals(ProtectedSandApp.s("ᕁ"))) {
                        c6 = 2;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals(ProtectedSandApp.s("ᕀ"))) {
                        c6 = 3;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals(ProtectedSandApp.s("ᔿ"))) {
                        c6 = 4;
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals(ProtectedSandApp.s("ᔾ"))) {
                        c6 = 5;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals(ProtectedSandApp.s("ᔽ"))) {
                        c6 = 6;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals(ProtectedSandApp.s("ᔼ"))) {
                        c6 = 7;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals(ProtectedSandApp.s("ᔻ"))) {
                        c6 = '\b';
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals(ProtectedSandApp.s("ᔺ"))) {
                        c6 = '\t';
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals(ProtectedSandApp.s("ᔹ"))) {
                        c6 = '\n';
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals(ProtectedSandApp.s("ᔸ"))) {
                        c6 = 11;
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    a6.m(jsonReader.nextLong());
                    break;
                case 1:
                    a6.c(jsonReader.nextString());
                    break;
                case 2:
                    a6.k(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    a6.f(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 4:
                    a6.e(s(jsonReader));
                    break;
                case 5:
                    a6.g(p(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.model.serialization.b
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.j.a
                        public final Object a(JsonReader jsonReader2) {
                            f0.f.d t5;
                            t5 = j.t(jsonReader2);
                            return t5;
                        }
                    }));
                    break;
                case 6:
                    a6.l(H(jsonReader));
                    break;
                case 7:
                    a6.b(n(jsonReader));
                    break;
                case '\b':
                    a6.n(M(jsonReader));
                    break;
                case '\t':
                    a6.h(jsonReader.nextString());
                    break;
                case '\n':
                    a6.d(jsonReader.nextBoolean());
                    break;
                case 11:
                    a6.i(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a6.a();
    }

    @o0
    private static f0.f.AbstractC0215f M(@o0 JsonReader jsonReader) throws IOException {
        f0.f.AbstractC0215f.a a6 = f0.f.AbstractC0215f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals(ProtectedSandApp.s("ᕄ"))) {
                a6.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a6.a();
    }

    @o0
    private static f0.f.a n(@o0 JsonReader jsonReader) throws IOException {
        f0.f.a.AbstractC0200a a6 = f0.f.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c6 = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals(ProtectedSandApp.s("ᕊ"))) {
                        c6 = 0;
                        break;
                    }
                    break;
                case -519438642:
                    if (nextName.equals(ProtectedSandApp.s("ᕉ"))) {
                        c6 = 1;
                        break;
                    }
                    break;
                case 213652010:
                    if (nextName.equals(ProtectedSandApp.s("ᕈ"))) {
                        c6 = 2;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals(ProtectedSandApp.s("ᕇ"))) {
                        c6 = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals(ProtectedSandApp.s("ᕆ"))) {
                        c6 = 4;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals(ProtectedSandApp.s("ᕅ"))) {
                        c6 = 5;
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    a6.e(jsonReader.nextString());
                    break;
                case 1:
                    a6.b(jsonReader.nextString());
                    break;
                case 2:
                    a6.c(jsonReader.nextString());
                    break;
                case 3:
                    a6.h(jsonReader.nextString());
                    break;
                case 4:
                    a6.f(jsonReader.nextString());
                    break;
                case 5:
                    a6.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a6.a();
    }

    @o0
    private static f0.a o(@o0 JsonReader jsonReader) throws IOException {
        f0.a.b a6 = f0.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c6 = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals(ProtectedSandApp.s("ᕓ"))) {
                        c6 = 0;
                        break;
                    }
                    break;
                case 110987:
                    if (nextName.equals(ProtectedSandApp.s("ᕒ"))) {
                        c6 = 1;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals(ProtectedSandApp.s("ᕑ"))) {
                        c6 = 2;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals(ProtectedSandApp.s("ᕐ"))) {
                        c6 = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals(ProtectedSandApp.s("ᕏ"))) {
                        c6 = 4;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals(ProtectedSandApp.s("ᕎ"))) {
                        c6 = 5;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals(ProtectedSandApp.s("ᕍ"))) {
                        c6 = 6;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals(ProtectedSandApp.s("ᕌ"))) {
                        c6 = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals(ProtectedSandApp.s("ᕋ"))) {
                        c6 = '\b';
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    a6.b(p(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.model.serialization.i
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.j.a
                        public final Object a(JsonReader jsonReader2) {
                            f0.a.AbstractC0198a q5;
                            q5 = j.q(jsonReader2);
                            return q5;
                        }
                    }));
                    break;
                case 1:
                    a6.d(jsonReader.nextInt());
                    break;
                case 2:
                    a6.f(jsonReader.nextLong());
                    break;
                case 3:
                    a6.h(jsonReader.nextLong());
                    break;
                case 4:
                    a6.i(jsonReader.nextLong());
                    break;
                case 5:
                    a6.e(jsonReader.nextString());
                    break;
                case 6:
                    a6.g(jsonReader.nextInt());
                    break;
                case 7:
                    a6.j(jsonReader.nextString());
                    break;
                case '\b':
                    a6.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a6.a();
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
    public static f0.a.AbstractC0198a q(@o0 JsonReader jsonReader) throws IOException {
        f0.a.AbstractC0198a.AbstractC0199a a6 = f0.a.AbstractC0198a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c6 = 65535;
            switch (nextName.hashCode()) {
                case -609862170:
                    if (nextName.equals(ProtectedSandApp.s("ᕖ"))) {
                        c6 = 0;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals(ProtectedSandApp.s("ᕕ"))) {
                        c6 = 1;
                        break;
                    }
                    break;
                case 230943785:
                    if (nextName.equals(ProtectedSandApp.s("ᕔ"))) {
                        c6 = 2;
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    a6.d(jsonReader.nextString());
                    break;
                case 1:
                    a6.b(jsonReader.nextString());
                    break;
                case 2:
                    a6.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a6.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public static f0.d r(@o0 JsonReader jsonReader) throws IOException {
        f0.d.a a6 = f0.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals(ProtectedSandApp.s("ᕗ"))) {
                a6.b(jsonReader.nextString());
            } else if (nextName.equals(ProtectedSandApp.s("ᕘ"))) {
                a6.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a6.a();
    }

    @o0
    private static f0.f.c s(@o0 JsonReader jsonReader) throws IOException {
        f0.f.c.a a6 = f0.f.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c6 = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals(ProtectedSandApp.s("ᕡ"))) {
                        c6 = 0;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals(ProtectedSandApp.s("ᕠ"))) {
                        c6 = 1;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals(ProtectedSandApp.s("ᕟ"))) {
                        c6 = 2;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals(ProtectedSandApp.s("ᕞ"))) {
                        c6 = 3;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals(ProtectedSandApp.s("ᕝ"))) {
                        c6 = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals(ProtectedSandApp.s("ᕜ"))) {
                        c6 = 5;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals(ProtectedSandApp.s("ᕛ"))) {
                        c6 = 6;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals(ProtectedSandApp.s("ᕚ"))) {
                        c6 = 7;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals(ProtectedSandApp.s("ᕙ"))) {
                        c6 = '\b';
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    a6.i(jsonReader.nextBoolean());
                    break;
                case 1:
                    a6.e(jsonReader.nextString());
                    break;
                case 2:
                    a6.h(jsonReader.nextLong());
                    break;
                case 3:
                    a6.b(jsonReader.nextInt());
                    break;
                case 4:
                    a6.d(jsonReader.nextLong());
                    break;
                case 5:
                    a6.c(jsonReader.nextInt());
                    break;
                case 6:
                    a6.f(jsonReader.nextString());
                    break;
                case 7:
                    a6.j(jsonReader.nextInt());
                    break;
                case '\b':
                    a6.g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a6.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public static f0.f.d t(@o0 JsonReader jsonReader) throws IOException {
        f0.f.d.b a6 = f0.f.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c6 = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals(ProtectedSandApp.s("ᕧ"))) {
                        c6 = 0;
                        break;
                    }
                    break;
                case -259312414:
                    if (nextName.equals(ProtectedSandApp.s("ᕦ"))) {
                        c6 = 1;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals(ProtectedSandApp.s("ᕥ"))) {
                        c6 = 2;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals(ProtectedSandApp.s("ᕤ"))) {
                        c6 = 3;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals(ProtectedSandApp.s("ᕣ"))) {
                        c6 = 4;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals(ProtectedSandApp.s("ᕢ"))) {
                        c6 = 5;
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    a6.c(w(jsonReader));
                    break;
                case 1:
                    a6.e(C(jsonReader));
                    break;
                case 2:
                    a6.b(u(jsonReader));
                    break;
                case 3:
                    a6.d(A(jsonReader));
                    break;
                case 4:
                    a6.g(jsonReader.nextString());
                    break;
                case 5:
                    a6.f(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a6.a();
    }

    @o0
    private static f0.f.d.a u(@o0 JsonReader jsonReader) throws IOException {
        f0.f.d.a.AbstractC0202a a6 = f0.f.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c6 = 65535;
            switch (nextName.hashCode()) {
                case -1405314732:
                    if (nextName.equals(ProtectedSandApp.s("ᕮ"))) {
                        c6 = 0;
                        break;
                    }
                    break;
                case -1332194002:
                    if (nextName.equals(ProtectedSandApp.s("ᕭ"))) {
                        c6 = 1;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals(ProtectedSandApp.s("ᕬ"))) {
                        c6 = 2;
                        break;
                    }
                    break;
                case -80231855:
                    if (nextName.equals(ProtectedSandApp.s("ᕫ"))) {
                        c6 = 3;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals(ProtectedSandApp.s("ᕪ"))) {
                        c6 = 4;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals(ProtectedSandApp.s("ᕩ"))) {
                        c6 = 5;
                        break;
                    }
                    break;
                case 1847730860:
                    if (nextName.equals(ProtectedSandApp.s("ᕨ"))) {
                        c6 = 6;
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    a6.b(p(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.model.serialization.h
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.j.a
                        public final Object a(JsonReader jsonReader2) {
                            f0.f.d.a.c I;
                            I = j.I(jsonReader2);
                            return I;
                        }
                    }));
                    break;
                case 1:
                    a6.c(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case 2:
                    a6.f(x(jsonReader));
                    break;
                case 3:
                    a6.g(p(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.model.serialization.g
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.j.a
                        public final Object a(JsonReader jsonReader2) {
                            f0.d r5;
                            r5 = j.r(jsonReader2);
                            return r5;
                        }
                    }));
                    break;
                case 4:
                    a6.e(p(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.model.serialization.g
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.j.a
                        public final Object a(JsonReader jsonReader2) {
                            f0.d r5;
                            r5 = j.r(jsonReader2);
                            return r5;
                        }
                    }));
                    break;
                case 5:
                    a6.h(jsonReader.nextInt());
                    break;
                case 6:
                    a6.d(I(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a6.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public static f0.f.d.a.b.AbstractC0203a v(@o0 JsonReader jsonReader) throws IOException {
        f0.f.d.a.b.AbstractC0203a.AbstractC0204a a6 = f0.f.d.a.b.AbstractC0203a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c6 = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals(ProtectedSandApp.s("ᕲ"))) {
                        c6 = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals(ProtectedSandApp.s("ᕱ"))) {
                        c6 = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals(ProtectedSandApp.s("ᕰ"))) {
                        c6 = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals(ProtectedSandApp.s("ᕯ"))) {
                        c6 = 3;
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    a6.c(jsonReader.nextString());
                    break;
                case 1:
                    a6.d(jsonReader.nextLong());
                    break;
                case 2:
                    a6.f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    a6.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a6.a();
    }

    @o0
    private static f0.f.d.c w(@o0 JsonReader jsonReader) throws IOException {
        f0.f.d.c.a a6 = f0.f.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c6 = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals(ProtectedSandApp.s("ᕸ"))) {
                        c6 = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals(ProtectedSandApp.s("ᕷ"))) {
                        c6 = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals(ProtectedSandApp.s("ᕶ"))) {
                        c6 = 2;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals(ProtectedSandApp.s("ᕵ"))) {
                        c6 = 3;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals(ProtectedSandApp.s("ᕴ"))) {
                        c6 = 4;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals(ProtectedSandApp.s("ᕳ"))) {
                        c6 = 5;
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    a6.b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case 1:
                    a6.c(jsonReader.nextInt());
                    break;
                case 2:
                    a6.e(jsonReader.nextInt());
                    break;
                case 3:
                    a6.d(jsonReader.nextLong());
                    break;
                case 4:
                    a6.g(jsonReader.nextLong());
                    break;
                case 5:
                    a6.f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a6.a();
    }

    @o0
    private static f0.f.d.a.b x(@o0 JsonReader jsonReader) throws IOException {
        f0.f.d.a.b.AbstractC0205b a6 = f0.f.d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c6 = 65535;
            switch (nextName.hashCode()) {
                case -1375141843:
                    if (nextName.equals(ProtectedSandApp.s("ᕽ"))) {
                        c6 = 0;
                        break;
                    }
                    break;
                case -1337936983:
                    if (nextName.equals(ProtectedSandApp.s("ᕼ"))) {
                        c6 = 1;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals(ProtectedSandApp.s("ᕻ"))) {
                        c6 = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals(ProtectedSandApp.s("ᕺ"))) {
                        c6 = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals(ProtectedSandApp.s("ᕹ"))) {
                        c6 = 4;
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    a6.b(o(jsonReader));
                    break;
                case 1:
                    a6.f(p(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.model.serialization.c
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.j.a
                        public final Object a(JsonReader jsonReader2) {
                            f0.f.d.a.b.e E;
                            E = j.E(jsonReader2);
                            return E;
                        }
                    }));
                    break;
                case 2:
                    a6.e(D(jsonReader));
                    break;
                case 3:
                    a6.c(p(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.model.serialization.d
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.j.a
                        public final Object a(JsonReader jsonReader2) {
                            f0.f.d.a.b.AbstractC0203a v5;
                            v5 = j.v(jsonReader2);
                            return v5;
                        }
                    }));
                    break;
                case 4:
                    a6.d(y(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a6.a();
    }

    @o0
    private static f0.f.d.a.b.c y(@o0 JsonReader jsonReader) throws IOException {
        f0.f.d.a.b.c.AbstractC0206a a6 = f0.f.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c6 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals(ProtectedSandApp.s("ᖂ"))) {
                        c6 = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals(ProtectedSandApp.s("ᖁ"))) {
                        c6 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals(ProtectedSandApp.s("ᖀ"))) {
                        c6 = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals(ProtectedSandApp.s("ᕿ"))) {
                        c6 = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals(ProtectedSandApp.s("ᕾ"))) {
                        c6 = 4;
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    a6.c(p(jsonReader, new com.google.firebase.crashlytics.internal.model.serialization.a()));
                    break;
                case 1:
                    a6.e(jsonReader.nextString());
                    break;
                case 2:
                    a6.f(jsonReader.nextString());
                    break;
                case 3:
                    a6.b(y(jsonReader));
                    break;
                case 4:
                    a6.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a6.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public static f0.f.d.a.b.e.AbstractC0210b z(@o0 JsonReader jsonReader) throws IOException {
        f0.f.d.a.b.e.AbstractC0210b.AbstractC0211a a6 = f0.f.d.a.b.e.AbstractC0210b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c6 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals(ProtectedSandApp.s("ᖇ"))) {
                        c6 = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals(ProtectedSandApp.s("ᖆ"))) {
                        c6 = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals(ProtectedSandApp.s("ᖅ"))) {
                        c6 = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals(ProtectedSandApp.s("ᖄ"))) {
                        c6 = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals(ProtectedSandApp.s("ᖃ"))) {
                        c6 = 4;
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    a6.d(jsonReader.nextLong());
                    break;
                case 1:
                    a6.f(jsonReader.nextString());
                    break;
                case 2:
                    a6.e(jsonReader.nextLong());
                    break;
                case 3:
                    a6.b(jsonReader.nextString());
                    break;
                case 4:
                    a6.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a6.a();
    }

    @o0
    public f0 N(@o0 String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                f0 J = J(jsonReader);
                jsonReader.close();
                return J;
            } finally {
            }
        } catch (IllegalStateException e6) {
            throw new IOException(e6);
        }
    }

    @o0
    public String O(@o0 f0 f0Var) {
        return f16241a.a(f0Var);
    }

    @o0
    public f0.a j(@o0 String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                f0.a o5 = o(jsonReader);
                jsonReader.close();
                return o5;
            } finally {
            }
        } catch (IllegalStateException e6) {
            throw new IOException(e6);
        }
    }

    @o0
    public String k(@o0 f0.a aVar) {
        return f16241a.a(aVar);
    }

    @o0
    public f0.f.d l(@o0 String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                f0.f.d t5 = t(jsonReader);
                jsonReader.close();
                return t5;
            } finally {
            }
        } catch (IllegalStateException e6) {
            throw new IOException(e6);
        }
    }

    @o0
    public String m(@o0 f0.f.d dVar) {
        return f16241a.a(dVar);
    }
}
