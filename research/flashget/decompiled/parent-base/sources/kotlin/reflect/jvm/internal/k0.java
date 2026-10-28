package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.n;

/* compiled from: ReflectionObjectRenderer.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b*\u00060\u0004j\u0002`\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b*\u00060\u0004j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$¨\u0006&"}, d2 = {"Lkotlin/reflect/jvm/internal/k0;", "", "<init>", "()V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Lkotlin/reflect/jvm/internal/impl/descriptors/x0;", "receiver", "Lkotlin/k2;", "a", "(Ljava/lang/StringBuilder;Lkotlin/reflect/jvm/internal/impl/descriptors/x0;)V", "Lkotlin/reflect/jvm/internal/impl/descriptors/a;", "callable", "b", "(Ljava/lang/StringBuilder;Lkotlin/reflect/jvm/internal/impl/descriptors/a;)V", "descriptor", "", "c", "(Lkotlin/reflect/jvm/internal/impl/descriptors/a;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "g", "(Lkotlin/reflect/jvm/internal/impl/descriptors/u0;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/descriptors/z;", "d", "(Lkotlin/reflect/jvm/internal/impl/descriptors/z;)Ljava/lang/String;", "invoke", "e", "Lkotlin/reflect/jvm/internal/x;", "parameter", "f", "(Lkotlin/reflect/jvm/internal/x;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/types/h0;", "type", "h", "(Lkotlin/reflect/jvm/internal/impl/types/h0;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/renderer/c;", "Lkotlin/reflect/jvm/internal/impl/renderer/c;", "renderer", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final k0 f78694a = new k0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.renderer.c renderer = kotlin.reflect.jvm.internal.impl.renderer.c.f77798g;

    /* compiled from: ReflectionObjectRenderer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78696a;

        static {
            int[] iArr = new int[n.b.values().length];
            try {
                iArr[n.b.EXTENSION_RECEIVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.b.INSTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.b.VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f78696a = iArr;
        }
    }

    /* compiled from: ReflectionObjectRenderer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/j1;", "kotlin.jvm.PlatformType", "it", "", "a", "(Lkotlin/reflect/jvm/internal/impl/descriptors/j1;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<j1, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f78697b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(j1 j1Var) {
            k0 k0Var = k0.f78694a;
            kotlin.reflect.jvm.internal.impl.types.h0 type = j1Var.getType();
            kotlin.jvm.internal.l0.o(type, ProtectedSandApp.s("膊\u0001"));
            return k0Var.h(type);
        }
    }

    /* compiled from: ReflectionObjectRenderer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/j1;", "kotlin.jvm.PlatformType", "it", "", "a", "(Lkotlin/reflect/jvm/internal/impl/descriptors/j1;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<j1, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f78698b = new c(1);

        c() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(j1 j1Var) {
            k0 k0Var = k0.f78694a;
            kotlin.reflect.jvm.internal.impl.types.h0 type = j1Var.getType();
            kotlin.jvm.internal.l0.o(type, ProtectedSandApp.s("膋\u0001"));
            return k0Var.h(type);
        }
    }

    private k0() {
    }

    private final void a(StringBuilder sb, x0 x0Var) {
        if (x0Var != null) {
            kotlin.reflect.jvm.internal.impl.types.h0 type = x0Var.getType();
            kotlin.jvm.internal.l0.o(type, ProtectedSandApp.s("膌\u0001"));
            sb.append(h(type));
            sb.append(ProtectedSandApp.s("膍\u0001"));
        }
    }

    private final void b(StringBuilder sb, kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        x0 k4 = p0.k(aVar);
        x0 S = aVar.S();
        a(sb, k4);
        boolean z4 = (k4 == null || S == null) ? false : true;
        if (z4) {
            sb.append(ProtectedSandApp.s("膎\u0001"));
        }
        a(sb, S);
        if (z4) {
            sb.append(ProtectedSandApp.s("膏\u0001"));
        }
    }

    private final String c(kotlin.reflect.jvm.internal.impl.descriptors.a descriptor) {
        if (descriptor instanceof u0) {
            return g((u0) descriptor);
        }
        if (descriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.z) {
            return d((kotlin.reflect.jvm.internal.impl.descriptors.z) descriptor);
        }
        throw new IllegalStateException((ProtectedSandApp.s("膐\u0001") + descriptor).toString());
    }

    @fg.l
    public final String d(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.z descriptor) {
        kotlin.jvm.internal.l0.p(descriptor, ProtectedSandApp.s("膑\u0001"));
        StringBuilder sb = new StringBuilder();
        sb.append(ProtectedSandApp.s("膒\u0001"));
        k0 k0Var = f78694a;
        k0Var.b(sb, descriptor);
        kotlin.reflect.jvm.internal.impl.renderer.c cVar = renderer;
        kotlin.reflect.jvm.internal.impl.name.f name = descriptor.getName();
        kotlin.jvm.internal.l0.o(name, ProtectedSandApp.s("膓\u0001"));
        sb.append(cVar.x(name, true));
        List<j1> i4 = descriptor.i();
        kotlin.jvm.internal.l0.o(i4, ProtectedSandApp.s("膔\u0001"));
        kotlin.collections.g0.j3(i4, sb, (r14 & 2) != 0 ? ProtectedSandApp.s("慰\u0001") : ProtectedSandApp.s("膕\u0001"), (r14 & 4) != 0 ? "" : ProtectedSandApp.s("膎\u0001"), (r14 & 8) == 0 ? ProtectedSandApp.s("膏\u0001") : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? ProtectedSandApp.s("慱\u0001") : null, (r14 & 64) != 0 ? null : b.f78697b);
        sb.append(ProtectedSandApp.s("膖\u0001"));
        kotlin.reflect.jvm.internal.impl.types.h0 returnType = descriptor.getReturnType();
        kotlin.jvm.internal.l0.m(returnType);
        sb.append(k0Var.h(returnType));
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("膗\u0001"));
        return sb2;
    }

    @fg.l
    public final String e(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.z invoke) {
        kotlin.jvm.internal.l0.p(invoke, ProtectedSandApp.s("膘\u0001"));
        StringBuilder sb = new StringBuilder();
        k0 k0Var = f78694a;
        k0Var.b(sb, invoke);
        List<j1> i4 = invoke.i();
        kotlin.jvm.internal.l0.o(i4, ProtectedSandApp.s("膔\u0001"));
        kotlin.collections.g0.j3(i4, sb, (r14 & 2) != 0 ? ProtectedSandApp.s("慰\u0001") : ProtectedSandApp.s("膕\u0001"), (r14 & 4) != 0 ? "" : ProtectedSandApp.s("膎\u0001"), (r14 & 8) == 0 ? ProtectedSandApp.s("膏\u0001") : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? ProtectedSandApp.s("慱\u0001") : null, (r14 & 64) != 0 ? null : c.f78698b);
        sb.append(ProtectedSandApp.s("膙\u0001"));
        kotlin.reflect.jvm.internal.impl.types.h0 returnType = invoke.getReturnType();
        kotlin.jvm.internal.l0.m(returnType);
        sb.append(k0Var.h(returnType));
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("膗\u0001"));
        return sb2;
    }

    @fg.l
    public final String f(@fg.l x parameter) {
        kotlin.jvm.internal.l0.p(parameter, ProtectedSandApp.s("膚\u0001"));
        StringBuilder sb = new StringBuilder();
        int i4 = a.f78696a[parameter.getKind().ordinal()];
        if (i4 == 1) {
            sb.append(ProtectedSandApp.s("膝\u0001"));
        } else if (i4 == 2) {
            sb.append(ProtectedSandApp.s("膜\u0001"));
        } else if (i4 == 3) {
            sb.append(ProtectedSandApp.s("膛\u0001") + parameter.getIndex() + ' ' + parameter.getName());
        }
        sb.append(ProtectedSandApp.s("膞\u0001"));
        sb.append(f78694a.c(parameter.o().t0()));
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("膗\u0001"));
        return sb2;
    }

    @fg.l
    public final String g(@fg.l u0 descriptor) {
        kotlin.jvm.internal.l0.p(descriptor, ProtectedSandApp.s("膑\u0001"));
        StringBuilder sb = new StringBuilder();
        sb.append(descriptor.Q() ? ProtectedSandApp.s("膟\u0001") : ProtectedSandApp.s("膠\u0001"));
        k0 k0Var = f78694a;
        k0Var.b(sb, descriptor);
        kotlin.reflect.jvm.internal.impl.renderer.c cVar = renderer;
        kotlin.reflect.jvm.internal.impl.name.f name = descriptor.getName();
        kotlin.jvm.internal.l0.o(name, ProtectedSandApp.s("膓\u0001"));
        sb.append(cVar.x(name, true));
        sb.append(ProtectedSandApp.s("膖\u0001"));
        kotlin.reflect.jvm.internal.impl.types.h0 type = descriptor.getType();
        kotlin.jvm.internal.l0.o(type, ProtectedSandApp.s("膌\u0001"));
        sb.append(k0Var.h(type));
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("膗\u0001"));
        return sb2;
    }

    @fg.l
    public final String h(@fg.l kotlin.reflect.jvm.internal.impl.types.h0 type) {
        kotlin.jvm.internal.l0.p(type, ProtectedSandApp.s("膡\u0001"));
        return renderer.y(type);
    }
}
