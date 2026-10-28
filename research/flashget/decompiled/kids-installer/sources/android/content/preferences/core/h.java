package android.content.preferences.core;

import android.content.core.CorruptionException;
import android.content.core.j;
import android.content.preferences.core.d;
import android.content.preferences.e;
import d5.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.j0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.l0;
import kotlin.m2;

/* compiled from: PreferencesSerializer.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J \u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J\u001b\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/datastore/preferences/core/h;", "Landroidx/datastore/core/j;", "Landroidx/datastore/preferences/core/d;", "", "value", "Landroidx/datastore/preferences/e$f;", "d", "", "name", "Landroidx/datastore/preferences/core/a;", "mutablePreferences", "Lkotlin/m2;", "a", "Ljava/io/InputStream;", "input", "q", "(Ljava/io/InputStream;Lkotlin/coroutines/d;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "e", "(Landroidx/datastore/preferences/core/d;Ljava/io/OutputStream;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "fileExtension", "()Landroidx/datastore/preferences/core/d;", "defaultValue", "<init>", "()V", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class h implements j<d> {

    /* renamed from: a, reason: collision with root package name */
    @d
    public static final h f7114a = new h();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d
    private static final String fileExtension = "preferences_pb";

    /* compiled from: PreferencesSerializer.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7116a;

        static {
            int[] iArr = new int[e.f.b.values().length];
            iArr[e.f.b.BOOLEAN.ordinal()] = 1;
            iArr[e.f.b.FLOAT.ordinal()] = 2;
            iArr[e.f.b.DOUBLE.ordinal()] = 3;
            iArr[e.f.b.INTEGER.ordinal()] = 4;
            iArr[e.f.b.LONG.ordinal()] = 5;
            iArr[e.f.b.STRING.ordinal()] = 6;
            iArr[e.f.b.STRING_SET.ordinal()] = 7;
            iArr[e.f.b.VALUE_NOT_SET.ordinal()] = 8;
            f7116a = iArr;
        }
    }

    private h() {
    }

    private final void a(String str, e.f fVar, android.content.preferences.core.a aVar) {
        Set a6;
        e.f.b v02 = fVar.v0();
        switch (v02 == null ? -1 : a.f7116a[v02.ordinal()]) {
            case -1:
                throw new CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                aVar.o(f.a(str), Boolean.valueOf(fVar.h0()));
                return;
            case 2:
                aVar.o(f.c(str), Float.valueOf(fVar.S0()));
                return;
            case 3:
                aVar.o(f.b(str), Double.valueOf(fVar.J()));
                return;
            case 4:
                aVar.o(f.d(str), Integer.valueOf(fVar.D()));
                return;
            case 5:
                aVar.o(f.e(str), Long.valueOf(fVar.W()));
                return;
            case 6:
                d.a<String> f6 = f.f(str);
                String string = fVar.getString();
                l0.o(string, "value.string");
                aVar.o(f6, string);
                return;
            case 7:
                d.a<Set<String>> g5 = f.g(str);
                List<String> V0 = fVar.E().V0();
                l0.o(V0, "value.stringSet.stringsList");
                a6 = j0.a6(V0);
                aVar.o(g5, a6);
                return;
            case 8:
                throw new CorruptionException("Value not set.", null, 2, null);
        }
    }

    private final e.f d(Object value) {
        if (value instanceof Boolean) {
            e.f build = e.f.m3().r2(((Boolean) value).booleanValue()).build();
            l0.o(build, "newBuilder().setBoolean(value).build()");
            return build;
        }
        if (value instanceof Float) {
            e.f build2 = e.f.m3().t2(((Number) value).floatValue()).build();
            l0.o(build2, "newBuilder().setFloat(value).build()");
            return build2;
        }
        if (value instanceof Double) {
            e.f build3 = e.f.m3().s2(((Number) value).doubleValue()).build();
            l0.o(build3, "newBuilder().setDouble(value).build()");
            return build3;
        }
        if (value instanceof Integer) {
            e.f build4 = e.f.m3().u2(((Number) value).intValue()).build();
            l0.o(build4, "newBuilder().setInteger(value).build()");
            return build4;
        }
        if (value instanceof Long) {
            e.f build5 = e.f.m3().v2(((Number) value).longValue()).build();
            l0.o(build5, "newBuilder().setLong(value).build()");
            return build5;
        }
        if (value instanceof String) {
            e.f build6 = e.f.m3().w2((String) value).build();
            l0.o(build6, "newBuilder().setString(value).build()");
            return build6;
        }
        if (!(value instanceof Set)) {
            throw new IllegalStateException(l0.C("PreferencesSerializer does not support type: ", value.getClass().getName()));
        }
        e.f build7 = e.f.m3().y2(e.d.V2().i2((Set) value)).build();
        l0.o(build7, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
        return build7;
    }

    @d5.d
    public d b() {
        return e.b();
    }

    @d5.d
    public final String c() {
        return fileExtension;
    }

    @Override // android.content.core.j
    @d5.e
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object p(@d5.d d dVar, @d5.d OutputStream outputStream, @d5.d Continuation<? super m2> continuation) throws IOException, CorruptionException {
        Map<d.a<?>, Object> a6 = dVar.a();
        e.b.a P2 = e.b.P2();
        for (Map.Entry<d.a<?>, Object> entry : a6.entrySet()) {
            P2.k2(entry.getKey().getName(), d(entry.getValue()));
        }
        P2.build().L(outputStream);
        return m2.f23662a;
    }

    @Override // android.content.core.j
    public d o() {
        return e.b();
    }

    @Override // android.content.core.j
    @d5.e
    public Object q(@d5.d InputStream inputStream, @d5.d Continuation<? super d> continuation) throws IOException, CorruptionException {
        e.b a6 = android.content.preferences.d.INSTANCE.a(inputStream);
        android.content.preferences.core.a c6 = e.c(new d.b[0]);
        Map<String, e.f> A1 = a6.A1();
        l0.o(A1, "preferencesProto.preferencesMap");
        for (Map.Entry<String, e.f> entry : A1.entrySet()) {
            String name = entry.getKey();
            e.f value = entry.getValue();
            h hVar = f7114a;
            l0.o(name, "name");
            l0.o(value, "value");
            hVar.a(name, value, c6);
        }
        return c6.e();
    }
}
