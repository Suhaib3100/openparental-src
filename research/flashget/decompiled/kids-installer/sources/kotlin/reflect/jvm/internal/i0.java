package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;

/* compiled from: ReflectionObjectRenderer.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u0007\u001a\u00020\u0006*\u00060\u0002j\u0002`\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u0006*\u00060\u0002j\u0002`\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001b¨\u0006\u001f"}, d2 = {"Lkotlin/reflect/jvm/internal/i0;", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Lkotlin/reflect/jvm/internal/impl/descriptors/x0;", "receiver", "Lkotlin/m2;", "a", "Lkotlin/reflect/jvm/internal/impl/descriptors/a;", "callable", "b", "descriptor", "", "c", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "g", "Lkotlin/reflect/jvm/internal/impl/descriptors/z;", "d", "invoke", "e", "Lkotlin/reflect/jvm/internal/v;", "parameter", "f", "Lkotlin/reflect/jvm/internal/impl/types/h0;", "type", "h", "Lkotlin/reflect/jvm/internal/impl/renderer/c;", "Lkotlin/reflect/jvm/internal/impl/renderer/c;", "renderer", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final i0 f23876a = new i0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.renderer.c renderer = kotlin.reflect.jvm.internal.impl.renderer.c.f25816g;

    /* compiled from: ReflectionObjectRenderer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23878a;

        static {
            int[] iArr = new int[KParameter.b.values().length];
            try {
                iArr[KParameter.b.EXTENSION_RECEIVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KParameter.b.INSTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KParameter.b.VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23878a = iArr;
        }
    }

    /* compiled from: ReflectionObjectRenderer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/j1;", "kotlin.jvm.PlatformType", "it", "", "a", "(Lkotlin/reflect/jvm/internal/impl/descriptors/j1;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.l<j1, CharSequence> {

        /* renamed from: p, reason: collision with root package name */
        public static final b f23879p = new b();

        b() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence N(j1 j1Var) {
            i0 i0Var = i0.f23876a;
            kotlin.reflect.jvm.internal.impl.types.h0 type = j1Var.getType();
            kotlin.jvm.internal.l0.o(type, ProtectedSandApp.s("耥"));
            return i0Var.h(type);
        }
    }

    /* compiled from: ReflectionObjectRenderer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/j1;", "kotlin.jvm.PlatformType", "it", "", "a", "(Lkotlin/reflect/jvm/internal/impl/descriptors/j1;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.l<j1, CharSequence> {

        /* renamed from: p, reason: collision with root package name */
        public static final c f23880p = new c();

        c() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence N(j1 j1Var) {
            i0 i0Var = i0.f23876a;
            kotlin.reflect.jvm.internal.impl.types.h0 type = j1Var.getType();
            kotlin.jvm.internal.l0.o(type, ProtectedSandApp.s("耦"));
            return i0Var.h(type);
        }
    }

    private i0() {
    }

    private final void a(StringBuilder sb, x0 x0Var) {
        if (x0Var != null) {
            kotlin.reflect.jvm.internal.impl.types.h0 type = x0Var.getType();
            kotlin.jvm.internal.l0.o(type, ProtectedSandApp.s("䏎"));
            sb.append(h(type));
            sb.append(ProtectedSandApp.s("䏏"));
        }
    }

    private final void b(StringBuilder sb, kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        x0 i5 = n0.i(aVar);
        x0 t02 = aVar.t0();
        a(sb, i5);
        boolean z5 = (i5 == null || t02 == null) ? false : true;
        if (z5) {
            sb.append(ProtectedSandApp.s("䏐"));
        }
        a(sb, t02);
        if (z5) {
            sb.append(ProtectedSandApp.s("䏑"));
        }
    }

    private final String c(kotlin.reflect.jvm.internal.impl.descriptors.a descriptor) {
        if (descriptor instanceof u0) {
            return g((u0) descriptor);
        }
        if (descriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.z) {
            return d((kotlin.reflect.jvm.internal.impl.descriptors.z) descriptor);
        }
        throw new IllegalStateException((ProtectedSandApp.s("䏒") + descriptor).toString());
    }

    @d5.d
    public final String d(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.z descriptor) {
        kotlin.jvm.internal.l0.p(descriptor, ProtectedSandApp.s("䏓"));
        StringBuilder sb = new StringBuilder();
        sb.append(ProtectedSandApp.s("䏔"));
        i0 i0Var = f23876a;
        i0Var.b(sb, descriptor);
        kotlin.reflect.jvm.internal.impl.renderer.c cVar = renderer;
        kotlin.reflect.jvm.internal.impl.name.f name = descriptor.getName();
        kotlin.jvm.internal.l0.o(name, ProtectedSandApp.s("䏕"));
        sb.append(cVar.x(name, true));
        List<j1> n5 = descriptor.n();
        kotlin.jvm.internal.l0.o(n5, ProtectedSandApp.s("䏖"));
        kotlin.collections.y.k3(n5, sb, ProtectedSandApp.s("䏗"), ProtectedSandApp.s("䏘"), ProtectedSandApp.s("䏙"), 0, null, b.f23879p, 48, null);
        sb.append(ProtectedSandApp.s("䏚"));
        kotlin.reflect.jvm.internal.impl.types.h0 i5 = descriptor.i();
        kotlin.jvm.internal.l0.m(i5);
        sb.append(i0Var.h(i5));
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("䏛"));
        return sb2;
    }

    @d5.d
    public final String e(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.z invoke) {
        kotlin.jvm.internal.l0.p(invoke, ProtectedSandApp.s("䏜"));
        StringBuilder sb = new StringBuilder();
        i0 i0Var = f23876a;
        i0Var.b(sb, invoke);
        List<j1> n5 = invoke.n();
        kotlin.jvm.internal.l0.o(n5, ProtectedSandApp.s("䏝"));
        kotlin.collections.y.k3(n5, sb, ProtectedSandApp.s("䏞"), ProtectedSandApp.s("䏟"), ProtectedSandApp.s("䏠"), 0, null, c.f23880p, 48, null);
        sb.append(ProtectedSandApp.s("䏡"));
        kotlin.reflect.jvm.internal.impl.types.h0 i5 = invoke.i();
        kotlin.jvm.internal.l0.m(i5);
        sb.append(i0Var.h(i5));
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("䏢"));
        return sb2;
    }

    @d5.d
    public final String f(@d5.d v parameter) {
        kotlin.jvm.internal.l0.p(parameter, ProtectedSandApp.s("䏣"));
        StringBuilder sb = new StringBuilder();
        int i5 = a.f23878a[parameter.getKind().ordinal()];
        if (i5 == 1) {
            sb.append(ProtectedSandApp.s("䏦"));
        } else if (i5 == 2) {
            sb.append(ProtectedSandApp.s("䏥"));
        } else if (i5 == 3) {
            sb.append(ProtectedSandApp.s("䏤") + parameter.getIndex() + ' ' + parameter.getName());
        }
        sb.append(ProtectedSandApp.s("䏧"));
        sb.append(f23876a.c(parameter.n().F0()));
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("䏨"));
        return sb2;
    }

    @d5.d
    public final String g(@d5.d u0 descriptor) {
        kotlin.jvm.internal.l0.p(descriptor, ProtectedSandApp.s("䏩"));
        StringBuilder sb = new StringBuilder();
        sb.append(descriptor.q0() ? ProtectedSandApp.s("䏪") : ProtectedSandApp.s("䏫"));
        i0 i0Var = f23876a;
        i0Var.b(sb, descriptor);
        kotlin.reflect.jvm.internal.impl.renderer.c cVar = renderer;
        kotlin.reflect.jvm.internal.impl.name.f name = descriptor.getName();
        kotlin.jvm.internal.l0.o(name, ProtectedSandApp.s("䏬"));
        sb.append(cVar.x(name, true));
        sb.append(ProtectedSandApp.s("䏭"));
        kotlin.reflect.jvm.internal.impl.types.h0 type = descriptor.getType();
        kotlin.jvm.internal.l0.o(type, ProtectedSandApp.s("䏮"));
        sb.append(i0Var.h(type));
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("䏯"));
        return sb2;
    }

    @d5.d
    public final String h(@d5.d kotlin.reflect.jvm.internal.impl.types.h0 type) {
        kotlin.jvm.internal.l0.p(type, ProtectedSandApp.s("䏰"));
        return renderer.y(type);
    }
}
