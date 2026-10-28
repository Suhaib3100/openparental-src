package androidx.content.preferences.core;

import androidx.content.core.CorruptionException;
import androidx.content.core.j;
import androidx.content.preferences.core.d;
import androidx.content.preferences.e;
import fg.l;
import fg.m;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.k2;

/* compiled from: PreferencesSerializer.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/datastore/preferences/core/h;", "Landroidx/datastore/core/j;", "Landroidx/datastore/preferences/core/d;", "<init>", "()V", "", "value", "Landroidx/datastore/preferences/e$f;", "d", "(Ljava/lang/Object;)Landroidx/datastore/preferences/e$f;", "", "name", "Landroidx/datastore/preferences/core/a;", "mutablePreferences", "Lkotlin/k2;", "a", "(Ljava/lang/String;Landroidx/datastore/preferences/e$f;Landroidx/datastore/preferences/core/a;)V", "Ljava/io/InputStream;", "input", "C", "(Ljava/io/InputStream;Lkotlin/coroutines/d;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "e", "(Landroidx/datastore/preferences/core/d;Ljava/io/OutputStream;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "fileExtension", "()Landroidx/datastore/preferences/core/d;", "defaultValue", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements j<d> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private static final String fileExtension = "preferences_pb";

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final h f28568a = new h();

    /* compiled from: PreferencesSerializer.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28570a;

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
            f28570a = iArr;
        }
    }

    private h() {
    }

    private final void a(String name, e.f value, androidx.content.preferences.core.a mutablePreferences) {
        e.f.b V = value.V();
        switch (V == null ? -1 : a.f28570a[V.ordinal()]) {
            case -1:
                throw new CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                mutablePreferences.o(f.a(name), Boolean.valueOf(value.M0()));
                return;
            case 2:
                mutablePreferences.o(f.c(name), Float.valueOf(value.h0()));
                return;
            case 3:
                mutablePreferences.o(f.b(name), Double.valueOf(value.B0()));
                return;
            case 4:
                mutablePreferences.o(f.d(name), Integer.valueOf(value.z0()));
                return;
            case 5:
                mutablePreferences.o(f.e(name), Long.valueOf(value.H0()));
                return;
            case 6:
                d.a<String> f4 = f.f(name);
                String D0 = value.D0();
                l0.o(D0, "value.string");
                mutablePreferences.o(f4, D0);
                return;
            case 7:
                d.a<Set<String>> g4 = f.g(name);
                List<String> g12 = value.A0().g1();
                l0.o(g12, "value.stringSet.stringsList");
                mutablePreferences.o(g4, w.a6(g12));
                return;
            case 8:
                throw new CorruptionException("Value not set.", null, 2, null);
        }
    }

    private final e.f d(Object value) {
        if (value instanceof Boolean) {
            e.f a5 = e.f.l3().o2(((Boolean) value).booleanValue()).a();
            l0.o(a5, "newBuilder().setBoolean(value).build()");
            return a5;
        }
        if (value instanceof Float) {
            e.f a6 = e.f.l3().r2(((Number) value).floatValue()).a();
            l0.o(a6, "newBuilder().setFloat(value).build()");
            return a6;
        }
        if (value instanceof Double) {
            e.f a7 = e.f.l3().p2(((Number) value).doubleValue()).a();
            l0.o(a7, "newBuilder().setDouble(value).build()");
            return a7;
        }
        if (value instanceof Integer) {
            e.f a8 = e.f.l3().s2(((Number) value).intValue()).a();
            l0.o(a8, "newBuilder().setInteger(value).build()");
            return a8;
        }
        if (value instanceof Long) {
            e.f a10 = e.f.l3().t2(((Number) value).longValue()).a();
            l0.o(a10, "newBuilder().setLong(value).build()");
            return a10;
        }
        if (value instanceof String) {
            e.f a11 = e.f.l3().u2((String) value).a();
            l0.o(a11, "newBuilder().setString(value).build()");
            return a11;
        }
        if (!(value instanceof Set)) {
            throw new IllegalStateException(l0.C("PreferencesSerializer does not support type: ", value.getClass().getName()));
        }
        e.f a12 = e.f.l3().w2(e.d.U2().e2((Set) value)).a();
        l0.o(a12, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
        return a12;
    }

    @Override // androidx.content.core.j
    public d A() {
        return e.b();
    }

    @Override // androidx.content.core.j
    @m
    public Object C(@l InputStream inputStream, @l kotlin.coroutines.d<? super d> dVar) throws IOException, CorruptionException {
        e.b a5 = androidx.content.preferences.d.INSTANCE.a(inputStream);
        androidx.content.preferences.core.a c5 = e.c(new d.b[0]);
        Map<String, e.f> t12 = a5.t1();
        l0.o(t12, "preferencesProto.preferencesMap");
        for (Map.Entry<String, e.f> entry : t12.entrySet()) {
            String name = entry.getKey();
            e.f value = entry.getValue();
            h hVar = f28568a;
            l0.o(name, "name");
            l0.o(value, "value");
            hVar.a(name, value, c5);
        }
        return c5.e();
    }

    @l
    public d b() {
        return e.b();
    }

    @l
    public final String c() {
        return fileExtension;
    }

    @Override // androidx.content.core.j
    @m
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object B(@l d dVar, @l OutputStream outputStream, @l kotlin.coroutines.d<? super k2> dVar2) throws IOException, CorruptionException {
        Map<d.a<?>, Object> a5 = dVar.a();
        e.b.a O2 = e.b.O2();
        for (Map.Entry<d.a<?>, Object> entry : a5.entrySet()) {
            O2.g2(entry.getKey().getName(), d(entry.getValue()));
        }
        O2.a().writeTo(outputStream);
        return k2.f75408a;
    }
}
