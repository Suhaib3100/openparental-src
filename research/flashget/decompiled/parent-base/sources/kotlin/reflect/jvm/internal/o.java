package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.reflect.jvm.internal.i0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.a;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.k;
import kotlin.reflect.jvm.internal.r;

/* compiled from: KClassImpl.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00052\u00020\u0006:\u0001tB\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u0002\u0010\u001dJ\u0019\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R'\u00102\u001a\u0012\u0012\u000e\u0012\f0-R\b\u0012\u0004\u0012\u00028\u00000\u00000,8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000204038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u001e\u0010;\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003080\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020<0\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010:R\u0016\u0010@\u001a\u0004\u0018\u00010&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010(R\u0016\u0010B\u001a\u0004\u0018\u00010&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010(R \u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000C0\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010:R\u001e\u0010G\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010:R\u0016\u0010J\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020K038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u00106R\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020N038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u00106R\"\u0010R\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u00106R\u0016\u0010V\u001a\u0004\u0018\u00010S8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010Y\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010XR\u0014\u0010Z\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010XR\u0014\u0010\\\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010XR\u0014\u0010^\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010XR\u0014\u0010`\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010XR\u0014\u0010b\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010XR\u0014\u0010d\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010XR\u001a\u0010h\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\f\u0012\u0004\bf\u0010g\u001a\u0004\be\u0010XR\u0014\u0010\f\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010m\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010q\u001a\u00020n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0014\u0010s\u001a\u00020n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\br\u0010p¨\u0006u"}, d2 = {"Lkotlin/reflect/jvm/internal/o;", "", "T", "Lkotlin/reflect/jvm/internal/r;", "Lkotlin/reflect/d;", "Lkotlin/reflect/jvm/internal/p;", "Lkotlin/reflect/jvm/internal/f0;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "Lkotlin/reflect/jvm/internal/impl/name/b;", "classId", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/k;", "moduleData", "Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "i0", "(Lkotlin/reflect/jvm/internal/impl/name/b;Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/k;)Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "h0", "Lkotlin/reflect/jvm/internal/impl/name/f;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "X", "(Lkotlin/reflect/jvm/internal/impl/name/f;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/z;", "S", "", "index", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "value", "", "q", "(Ljava/lang/Object;)Z", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "e", "Ljava/lang/Class;", "()Ljava/lang/Class;", "Lkotlin/b0;", "Lkotlin/reflect/jvm/internal/o$a;", "f", "Lkotlin/b0;", "k0", "()Lkotlin/b0;", "data", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "Lkotlin/reflect/c;", "r", "()Ljava/util/Collection;", "members", "Lkotlin/reflect/jvm/internal/impl/descriptors/l;", "R", "constructorDescriptors", "W", "simpleName", "N", "qualifiedName", "Lkotlin/reflect/i;", "h", "constructors", "D", "nestedClasses", "E", "()Ljava/lang/Object;", "objectInstance", "Lkotlin/reflect/t;", "getTypeParameters", "typeParameters", "Lkotlin/reflect/s;", "j", "supertypes", "m", "sealedSubclasses", "Lkotlin/reflect/w;", "getVisibility", "()Lkotlin/reflect/w;", "visibility", "isFinal", "()Z", "isOpen", "isAbstract", "p", "isSealed", "C", "isData", "n", "isInner", "F", "isCompanion", "v", "isFun", "w", "isValue$annotations", "()V", "isValue", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "memberScope", "getStaticScope$kotlin_reflection", "staticScope", "a", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class o<T> extends r implements kotlin.reflect.d<T>, p, f0 {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Class<T> jClass;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.b0<o<T>.a> data;

    /* compiled from: KClassImpl.kt */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u001a\u0010\u0017R-\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d0\u001c8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\f\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R%\u0010'\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030$0\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b&\u0010 R#\u0010,\u001a\u0004\u0018\u00018\u00008FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010(\u0012\u0004\b+\u0010\"\u001a\u0004\b)\u0010*R!\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b.\u0010\u0014R!\u00103\u001a\b\u0012\u0004\u0012\u0002000\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\f\u001a\u0004\b2\u0010\u0014R)\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000$0\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\f\u001a\u0004\b5\u0010\u0014R%\u00109\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003070\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\f\u001a\u0004\b4\u0010 R%\u0010;\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003070\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\f\u001a\u0004\b8\u0010 R%\u0010=\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003070\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\f\u001a\u0004\b<\u0010 R%\u0010?\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003070\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\f\u001a\u0004\b>\u0010 R%\u0010@\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003070\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\f\u001a\u0004\b\u001e\u0010 R%\u0010A\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003070\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\f\u001a\u0004\b%\u0010 R%\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003070\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b1\u0010 R%\u0010C\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003070\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\f\u001a\u0004\b\u0019\u0010 ¨\u0006D"}, d2 = {"Lkotlin/reflect/jvm/internal/o$a;", "Lkotlin/reflect/jvm/internal/r$b;", "Lkotlin/reflect/jvm/internal/r;", "<init>", "(Lkotlin/reflect/jvm/internal/o;)V", "Ljava/lang/Class;", "jClass", "", "f", "(Ljava/lang/Class;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "d", "Lkotlin/reflect/jvm/internal/i0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "", "", "e", "j", "()Ljava/util/List;", "annotations", "v", "()Ljava/lang/String;", "simpleName", "g", "t", "qualifiedName", "", "Lkotlin/reflect/i;", "h", "k", "()Ljava/util/Collection;", "getConstructors$annotations", "()V", "constructors", "Lkotlin/reflect/d;", "i", "r", "nestedClasses", "Lkotlin/b0;", "s", "()Ljava/lang/Object;", "getObjectInstance$annotations", "objectInstance", "Lkotlin/reflect/t;", "x", "typeParameters", "Lkotlin/reflect/s;", "l", "w", "supertypes", "m", "u", "sealedSubclasses", "Lkotlin/reflect/jvm/internal/n;", "n", "declaredNonStaticMembers", "o", "declaredStaticMembers", "p", "inheritedNonStaticMembers", "q", "inheritedStaticMembers", "allNonStaticMembers", "allStaticMembers", "declaredMembers", "allMembers", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a extends r.b {

        /* renamed from: w, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.o<Object>[] f78742w = {l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("臹\u0001"), ProtectedSandApp.s("臺\u0001"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("臻\u0001"), ProtectedSandApp.s("臼\u0001"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("臽\u0001"), ProtectedSandApp.s("臾\u0001"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("臿\u0001"), ProtectedSandApp.s("舀\u0001"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("舁\u0001"), ProtectedSandApp.s("舂\u0001"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("舃\u0001"), ProtectedSandApp.s("舄\u0001"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("舅\u0001"), ProtectedSandApp.s("舆\u0001"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("與\u0001"), ProtectedSandApp.s("興\u0001"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("舉\u0001"), ProtectedSandApp.s("舊\u0001"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("舋\u0001"), ProtectedSandApp.s("舌\u0001"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("舍\u0001"), ProtectedSandApp.s("舎\u0001"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("舏\u0001"), ProtectedSandApp.s("舐\u0001"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("舑\u0001"), ProtectedSandApp.s("舒\u0001"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("舓\u0001"), ProtectedSandApp.s("舔\u0001"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("舕\u0001"), ProtectedSandApp.s("舖\u0001"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("舗\u0001"), ProtectedSandApp.s("舘\u0001"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("舙\u0001"), ProtectedSandApp.s("舚\u0001")))};

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i0.a descriptor;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i0.a annotations;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i0.a simpleName;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i0.a qualifiedName;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i0.a constructors;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i0.a nestedClasses;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final kotlin.b0 objectInstance;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i0.a typeParameters;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i0.a supertypes;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i0.a sealedSubclasses;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i0.a declaredNonStaticMembers;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i0.a declaredStaticMembers;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i0.a inheritedNonStaticMembers;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i0.a inheritedStaticMembers;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i0.a allNonStaticMembers;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i0.a allStaticMembers;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i0.a declaredMembers;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i0.a allMembers;

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/n;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: kotlin.reflect.jvm.internal.o$a$a, reason: collision with other inner class name */
        static final class C1204a extends kotlin.jvm.internal.n0 implements ld.a<List<? extends kotlin.reflect.jvm.internal.n<?>>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o<T>.a f78762b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1204a(o<T>.a aVar) {
                super(0);
                this.f78762b = aVar;
            }

            @Override // ld.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<kotlin.reflect.jvm.internal.n<?>> invoke() {
                return kotlin.collections.w.D4(this.f78762b.h(), this.f78762b.i());
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/n;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.a<List<? extends kotlin.reflect.jvm.internal.n<?>>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o<T>.a f78763b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(o<T>.a aVar) {
                super(0);
                this.f78763b = aVar;
            }

            @Override // ld.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<kotlin.reflect.jvm.internal.n<?>> invoke() {
                return kotlin.collections.w.D4(this.f78763b.m(), this.f78763b.p());
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/n;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
        static final class c extends kotlin.jvm.internal.n0 implements ld.a<List<? extends kotlin.reflect.jvm.internal.n<?>>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o<T>.a f78764b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(o<T>.a aVar) {
                super(0);
                this.f78764b = aVar;
            }

            @Override // ld.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<kotlin.reflect.jvm.internal.n<?>> invoke() {
                return kotlin.collections.w.D4(this.f78764b.n(), this.f78764b.q());
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
        static final class d extends kotlin.jvm.internal.n0 implements ld.a<List<? extends Annotation>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o<T>.a f78765b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(o<T>.a aVar) {
                super(0);
                this.f78765b = aVar;
            }

            @Override // ld.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<Annotation> invoke() {
                return p0.e(this.f78765b.o());
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/i;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
        @r1({"SMAP\nKClassImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClassImpl.kt\nkotlin/reflect/jvm/internal/KClassImpl$Data$constructors$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,362:1\n1549#2:363\n1620#2,3:364\n*S KotlinDebug\n*F\n+ 1 KClassImpl.kt\nkotlin/reflect/jvm/internal/KClassImpl$Data$constructors$2\n*L\n105#1:363\n105#1:364,3\n*E\n"})
        static final class e extends kotlin.jvm.internal.n0 implements ld.a<List<? extends kotlin.reflect.i<? extends T>>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o<T> f78766b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(o<T> oVar) {
                super(0);
                this.f78766b = oVar;
            }

            @Override // ld.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<kotlin.reflect.i<T>> invoke() {
                Collection<kotlin.reflect.jvm.internal.impl.descriptors.l> R = this.f78766b.R();
                o<T> oVar = this.f78766b;
                ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(R, 10));
                Iterator<T> it = R.iterator();
                while (it.hasNext()) {
                    arrayList.add(new s(oVar, (kotlin.reflect.jvm.internal.impl.descriptors.l) it.next()));
                }
                return arrayList;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/n;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
        static final class f extends kotlin.jvm.internal.n0 implements ld.a<List<? extends kotlin.reflect.jvm.internal.n<?>>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o<T>.a f78767b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(o<T>.a aVar) {
                super(0);
                this.f78767b = aVar;
            }

            @Override // ld.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<kotlin.reflect.jvm.internal.n<?>> invoke() {
                return kotlin.collections.w.D4(this.f78767b.m(), this.f78767b.n());
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/n;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/Collection;"}, k = 3, mv = {1, 9, 0})
        static final class g extends kotlin.jvm.internal.n0 implements ld.a<Collection<? extends kotlin.reflect.jvm.internal.n<?>>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o<T> f78768b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(o<T> oVar) {
                super(0);
                this.f78768b = oVar;
            }

            @Override // ld.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<kotlin.reflect.jvm.internal.n<?>> invoke() {
                o<T> oVar = this.f78768b;
                return oVar.U(oVar.m0(), r.c.DECLARED);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/n;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/Collection;"}, k = 3, mv = {1, 9, 0})
        static final class h extends kotlin.jvm.internal.n0 implements ld.a<Collection<? extends kotlin.reflect.jvm.internal.n<?>>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o<T> f78769b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(o<T> oVar) {
                super(0);
                this.f78769b = oVar;
            }

            @Override // ld.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<kotlin.reflect.jvm.internal.n<?>> invoke() {
                o<T> oVar = this.f78769b;
                return oVar.U(oVar.n0(), r.c.DECLARED);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/e;"}, k = 3, mv = {1, 9, 0})
        static final class i extends kotlin.jvm.internal.n0 implements ld.a<kotlin.reflect.jvm.internal.impl.descriptors.e> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o<T> f78770b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(o<T> oVar) {
                super(0);
                this.f78770b = oVar;
            }

            @Override // ld.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.descriptors.e invoke() {
                kotlin.reflect.jvm.internal.impl.name.b j02 = this.f78770b.j0();
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k a5 = this.f78770b.k0().getValue().a();
                kotlin.reflect.jvm.internal.impl.descriptors.e b5 = (j02.k() && this.f78770b.e().isAnnotationPresent(Metadata.class)) ? a5.a().b(j02) : kotlin.reflect.jvm.internal.impl.descriptors.y.a(a5.b(), j02);
                return b5 == null ? this.f78770b.i0(j02, a5) : b5;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/n;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/Collection;"}, k = 3, mv = {1, 9, 0})
        static final class j extends kotlin.jvm.internal.n0 implements ld.a<Collection<? extends kotlin.reflect.jvm.internal.n<?>>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o<T> f78771b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(o<T> oVar) {
                super(0);
                this.f78771b = oVar;
            }

            @Override // ld.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<kotlin.reflect.jvm.internal.n<?>> invoke() {
                o<T> oVar = this.f78771b;
                return oVar.U(oVar.m0(), r.c.INHERITED);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/n;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/Collection;"}, k = 3, mv = {1, 9, 0})
        static final class k extends kotlin.jvm.internal.n0 implements ld.a<Collection<? extends kotlin.reflect.jvm.internal.n<?>>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o<T> f78772b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(o<T> oVar) {
                super(0);
                this.f78772b = oVar;
            }

            @Override // ld.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<kotlin.reflect.jvm.internal.n<?>> invoke() {
                o<T> oVar = this.f78772b;
                return oVar.U(oVar.n0(), r.c.INHERITED);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a6\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00000\u00000\u0003 \u0004*\u001a\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00000\u00000\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/o;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
        @r1({"SMAP\nKClassImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClassImpl.kt\nkotlin/reflect/jvm/internal/KClassImpl$Data$nestedClasses$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,362:1\n819#2:363\n847#2,2:364\n1603#2,9:366\n1855#2:375\n1856#2:378\n1612#2:379\n1#3:376\n1#3:377\n*S KotlinDebug\n*F\n+ 1 KClassImpl.kt\nkotlin/reflect/jvm/internal/KClassImpl$Data$nestedClasses$2\n*L\n111#1:363\n111#1:364,2\n112#1:366,9\n112#1:375\n112#1:378\n112#1:379\n112#1:377\n*E\n"})
        static final class l extends kotlin.jvm.internal.n0 implements ld.a<List<? extends o<? extends Object>>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o<T>.a f78773b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            l(o<T>.a aVar) {
                super(0);
                this.f78773b = aVar;
            }

            @Override // ld.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<o<? extends Object>> invoke() {
                kotlin.reflect.jvm.internal.impl.resolve.scopes.h W = this.f78773b.o().W();
                kotlin.jvm.internal.l0.o(W, ProtectedSandApp.s("臦\u0001"));
                Collection a5 = k.a.a(W, null, null, 3, null);
                ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.m> arrayList = new ArrayList();
                for (T t4 : a5) {
                    if (!kotlin.reflect.jvm.internal.impl.resolve.f.B((kotlin.reflect.jvm.internal.impl.descriptors.m) t4)) {
                        arrayList.add(t4);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (kotlin.reflect.jvm.internal.impl.descriptors.m mVar : arrayList) {
                    kotlin.reflect.jvm.internal.impl.descriptors.e eVar = mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) mVar : null;
                    Class<?> s4 = eVar != null ? p0.s(eVar) : null;
                    o oVar = s4 != null ? new o(s4) : null;
                    if (oVar != null) {
                        arrayList2.add(oVar);
                    }
                }
                return arrayList2;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        static final class m extends kotlin.jvm.internal.n0 implements ld.a<T> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o<T>.a f78774b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ o<T> f78775c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            m(o<T>.a aVar, o<T> oVar) {
                super(0);
                this.f78774b = aVar;
                this.f78775c = oVar;
            }

            @Override // ld.a
            @fg.m
            public final T invoke() {
                kotlin.reflect.jvm.internal.impl.descriptors.e o4 = this.f78774b.o();
                if (o4.b() != kotlin.reflect.jvm.internal.impl.descriptors.f.OBJECT) {
                    return null;
                }
                T t4 = (T) ((!o4.e0() || kotlin.reflect.jvm.internal.impl.builtins.d.a(kotlin.reflect.jvm.internal.impl.builtins.c.f75665a, o4)) ? this.f78775c.e().getDeclaredField(ProtectedSandApp.s("臧\u0001")) : this.f78775c.e().getEnclosingClass().getDeclaredField(o4.getName().b())).get(null);
                kotlin.jvm.internal.l0.n(t4, ProtectedSandApp.s("臨\u0001"));
                return t4;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        static final class n extends kotlin.jvm.internal.n0 implements ld.a<String> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o<T> f78776b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(o<T> oVar) {
                super(0);
                this.f78776b = oVar;
            }

            @Override // ld.a
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                if (this.f78776b.e().isAnonymousClass()) {
                    return null;
                }
                kotlin.reflect.jvm.internal.impl.name.b j02 = this.f78776b.j0();
                if (j02.k()) {
                    return null;
                }
                return j02.b().b();
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a&\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003 \u0004*\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/o;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
        @r1({"SMAP\nKClassImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClassImpl.kt\nkotlin/reflect/jvm/internal/KClassImpl$Data$sealedSubclasses$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,362:1\n1603#2,9:363\n1855#2:372\n1856#2:375\n1612#2:376\n1#3:373\n1#3:374\n*S KotlinDebug\n*F\n+ 1 KClassImpl.kt\nkotlin/reflect/jvm/internal/KClassImpl$Data$sealedSubclasses$2\n*L\n165#1:363,9\n165#1:372\n165#1:375\n165#1:376\n165#1:374\n*E\n"})
        /* renamed from: kotlin.reflect.jvm.internal.o$a$o, reason: collision with other inner class name */
        static final class C1205o extends kotlin.jvm.internal.n0 implements ld.a<List<? extends o<? extends T>>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o<T>.a f78777b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1205o(o<T>.a aVar) {
                super(0);
                this.f78777b = aVar;
            }

            @Override // ld.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<o<? extends T>> invoke() {
                Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> m4 = this.f78777b.o().m();
                kotlin.jvm.internal.l0.o(m4, ProtectedSandApp.s("臩\u0001"));
                ArrayList arrayList = new ArrayList();
                for (kotlin.reflect.jvm.internal.impl.descriptors.e eVar : m4) {
                    kotlin.jvm.internal.l0.n(eVar, ProtectedSandApp.s("自\u0001"));
                    Class<?> s4 = p0.s(eVar);
                    o oVar = s4 != null ? new o(s4) : null;
                    if (oVar != null) {
                        arrayList.add(oVar);
                    }
                }
                return arrayList;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        static final class p extends kotlin.jvm.internal.n0 implements ld.a<String> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o<T> f78778b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ o<T>.a f78779c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            p(o<T> oVar, o<T>.a aVar) {
                super(0);
                this.f78778b = oVar;
                this.f78779c = aVar;
            }

            @Override // ld.a
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                if (this.f78778b.e().isAnonymousClass()) {
                    return null;
                }
                kotlin.reflect.jvm.internal.impl.name.b j02 = this.f78778b.j0();
                if (j02.k()) {
                    return this.f78779c.f(this.f78778b.e());
                }
                String b5 = j02.j().b();
                kotlin.jvm.internal.l0.o(b5, ProtectedSandApp.s("臫\u0001"));
                return b5;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/d0;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
        @r1({"SMAP\nKClassImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClassImpl.kt\nkotlin/reflect/jvm/internal/KClassImpl$Data$supertypes$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,362:1\n1620#2,3:363\n1726#2,3:366\n*S KotlinDebug\n*F\n+ 1 KClassImpl.kt\nkotlin/reflect/jvm/internal/KClassImpl$Data$supertypes$2\n*L\n138#1:363,3\n155#1:366,3\n*E\n"})
        static final class q extends kotlin.jvm.internal.n0 implements ld.a<List<? extends d0>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o<T>.a f78780b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ o<T> f78781c;

            /* compiled from: KClassImpl.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: kotlin.reflect.jvm.internal.o$a$q$a, reason: collision with other inner class name */
            static final class C1206a extends kotlin.jvm.internal.n0 implements ld.a<Type> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.h0 f78782b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ o<T>.a f78783c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ o<T> f78784d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1206a(kotlin.reflect.jvm.internal.impl.types.h0 h0Var, o<T>.a aVar, o<T> oVar) {
                    super(0);
                    this.f78782b = h0Var;
                    this.f78783c = aVar;
                    this.f78784d = oVar;
                }

                @Override // ld.a
                @fg.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Type invoke() {
                    kotlin.reflect.jvm.internal.impl.descriptors.h c5 = this.f78782b.O0().c();
                    if (!(c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
                        throw new g0(ProtectedSandApp.s("臱\u0001") + c5);
                    }
                    Class<?> s4 = p0.s((kotlin.reflect.jvm.internal.impl.descriptors.e) c5);
                    if (s4 == null) {
                        throw new g0(ProtectedSandApp.s("臯\u0001") + this.f78783c + ProtectedSandApp.s("臰\u0001") + c5);
                    }
                    if (kotlin.jvm.internal.l0.g(this.f78784d.e().getSuperclass(), s4)) {
                        Type genericSuperclass = this.f78784d.e().getGenericSuperclass();
                        kotlin.jvm.internal.l0.m(genericSuperclass);
                        return genericSuperclass;
                    }
                    Class<?>[] interfaces = this.f78784d.e().getInterfaces();
                    kotlin.jvm.internal.l0.o(interfaces, ProtectedSandApp.s("臬\u0001"));
                    int If = kotlin.collections.l.If(interfaces, s4);
                    if (If >= 0) {
                        Type type = this.f78784d.e().getGenericInterfaces()[If];
                        kotlin.jvm.internal.l0.m(type);
                        return type;
                    }
                    throw new g0(ProtectedSandApp.s("臭\u0001") + this.f78783c + ProtectedSandApp.s("臮\u0001") + c5);
                }
            }

            /* compiled from: KClassImpl.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;"}, k = 3, mv = {1, 9, 0})
            static final class b extends kotlin.jvm.internal.n0 implements ld.a<Type> {

                /* renamed from: b, reason: collision with root package name */
                public static final b f78785b = new b(0);

                b() {
                    super(0);
                }

                @fg.l
                public final Type a() {
                    return Object.class;
                }

                @Override // ld.a
                public Type invoke() {
                    return Object.class;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            q(o<T>.a aVar, o<T> oVar) {
                super(0);
                this.f78780b = aVar;
                this.f78781c = oVar;
            }

            @Override // ld.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<d0> invoke() {
                Collection<kotlin.reflect.jvm.internal.impl.types.h0> j4 = this.f78780b.o().j().j();
                kotlin.jvm.internal.l0.o(j4, ProtectedSandApp.s("臲\u0001"));
                ArrayList arrayList = new ArrayList(j4.size());
                o<T>.a aVar = this.f78780b;
                o<T> oVar = this.f78781c;
                for (kotlin.reflect.jvm.internal.impl.types.h0 h0Var : j4) {
                    kotlin.jvm.internal.l0.m(h0Var);
                    arrayList.add(new d0(h0Var, new C1206a(h0Var, aVar, oVar)));
                }
                if (!kotlin.reflect.jvm.internal.impl.builtins.h.u0(this.f78780b.o())) {
                    if (!arrayList.isEmpty()) {
                        Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            kotlin.reflect.jvm.internal.impl.descriptors.f b5 = kotlin.reflect.jvm.internal.impl.resolve.f.e(((d0) it.next()).getType()).b();
                            kotlin.jvm.internal.l0.o(b5, ProtectedSandApp.s("至\u0001"));
                            if (b5 != kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE && b5 != kotlin.reflect.jvm.internal.impl.descriptors.f.ANNOTATION_CLASS) {
                                break;
                            }
                        }
                    }
                    kotlin.reflect.jvm.internal.impl.types.p0 i4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(this.f78780b.o()).i();
                    kotlin.jvm.internal.l0.o(i4, ProtectedSandApp.s("致\u0001"));
                    arrayList.add(new d0(i4, b.f78785b));
                }
                return kotlin.reflect.jvm.internal.impl.utils.a.c(arrayList);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/e0;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
        @r1({"SMAP\nKClassImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClassImpl.kt\nkotlin/reflect/jvm/internal/KClassImpl$Data$typeParameters$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,362:1\n1549#2:363\n1620#2,3:364\n*S KotlinDebug\n*F\n+ 1 KClassImpl.kt\nkotlin/reflect/jvm/internal/KClassImpl$Data$typeParameters$2\n*L\n132#1:363\n132#1:364,3\n*E\n"})
        static final class r extends kotlin.jvm.internal.n0 implements ld.a<List<? extends e0>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o<T>.a f78786b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ o<T> f78787c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            r(o<T>.a aVar, o<T> oVar) {
                super(0);
                this.f78786b = aVar;
                this.f78787c = oVar;
            }

            @Override // ld.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<e0> invoke() {
                List<f1> s4 = this.f78786b.o().s();
                kotlin.jvm.internal.l0.o(s4, ProtectedSandApp.s("臵\u0001"));
                List<f1> list = s4;
                o<T> oVar = this.f78787c;
                ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list, 10));
                for (f1 f1Var : list) {
                    kotlin.jvm.internal.l0.m(f1Var);
                    arrayList.add(new e0(oVar, f1Var));
                }
                return arrayList;
            }
        }

        public a() {
            super();
            this.descriptor = i0.c(new i(o.this));
            this.annotations = i0.c(new d(this));
            this.simpleName = i0.c(new p(o.this, this));
            this.qualifiedName = i0.c(new n(o.this));
            this.constructors = i0.c(new e(o.this));
            this.nestedClasses = i0.c(new l(this));
            this.objectInstance = kotlin.c0.b(kotlin.f0.PUBLICATION, new m(this, o.this));
            this.typeParameters = i0.c(new r(this, o.this));
            this.supertypes = i0.c(new q(this, o.this));
            this.sealedSubclasses = i0.c(new C1205o(this));
            this.declaredNonStaticMembers = i0.c(new g(o.this));
            this.declaredStaticMembers = i0.c(new h(o.this));
            this.inheritedNonStaticMembers = i0.c(new j(o.this));
            this.inheritedStaticMembers = i0.c(new k(o.this));
            this.allNonStaticMembers = i0.c(new b(this));
            this.allStaticMembers = i0.c(new c(this));
            this.declaredMembers = i0.c(new f(this));
            this.allMembers = i0.c(new C1204a(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(Class<?> jClass) {
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                kotlin.jvm.internal.l0.m(simpleName);
                return kotlin.text.v.n5(simpleName, enclosingMethod.getName() + '$', null, 2, null);
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                kotlin.jvm.internal.l0.m(simpleName);
                return kotlin.text.v.m5(simpleName, '$', null, 2, null);
            }
            kotlin.jvm.internal.l0.m(simpleName);
            return kotlin.text.v.n5(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Collection<kotlin.reflect.jvm.internal.n<?>> n() {
            i0.a aVar = this.declaredStaticMembers;
            kotlin.reflect.o<Object> oVar = f78742w[10];
            Object invoke = aVar.invoke();
            kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("舛\u0001"));
            return (Collection) invoke;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Collection<kotlin.reflect.jvm.internal.n<?>> p() {
            i0.a aVar = this.inheritedNonStaticMembers;
            kotlin.reflect.o<Object> oVar = f78742w[11];
            Object invoke = aVar.invoke();
            kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("舛\u0001"));
            return (Collection) invoke;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Collection<kotlin.reflect.jvm.internal.n<?>> q() {
            i0.a aVar = this.inheritedStaticMembers;
            kotlin.reflect.o<Object> oVar = f78742w[12];
            Object invoke = aVar.invoke();
            kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("舛\u0001"));
            return (Collection) invoke;
        }

        @fg.l
        public final Collection<kotlin.reflect.jvm.internal.n<?>> g() {
            i0.a aVar = this.allMembers;
            kotlin.reflect.o<Object> oVar = f78742w[16];
            Object invoke = aVar.invoke();
            kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("舛\u0001"));
            return (Collection) invoke;
        }

        @fg.l
        public final Collection<kotlin.reflect.jvm.internal.n<?>> h() {
            i0.a aVar = this.allNonStaticMembers;
            kotlin.reflect.o<Object> oVar = f78742w[13];
            Object invoke = aVar.invoke();
            kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("舛\u0001"));
            return (Collection) invoke;
        }

        @fg.l
        public final Collection<kotlin.reflect.jvm.internal.n<?>> i() {
            i0.a aVar = this.allStaticMembers;
            kotlin.reflect.o<Object> oVar = f78742w[14];
            Object invoke = aVar.invoke();
            kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("舛\u0001"));
            return (Collection) invoke;
        }

        @fg.l
        public final List<Annotation> j() {
            i0.a aVar = this.annotations;
            kotlin.reflect.o<Object> oVar = f78742w[1];
            Object invoke = aVar.invoke();
            kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("舛\u0001"));
            return (List) invoke;
        }

        @fg.l
        public final Collection<kotlin.reflect.i<T>> k() {
            i0.a aVar = this.constructors;
            kotlin.reflect.o<Object> oVar = f78742w[4];
            Object invoke = aVar.invoke();
            kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("舛\u0001"));
            return (Collection) invoke;
        }

        @fg.l
        public final Collection<kotlin.reflect.jvm.internal.n<?>> l() {
            i0.a aVar = this.declaredMembers;
            kotlin.reflect.o<Object> oVar = f78742w[15];
            Object invoke = aVar.invoke();
            kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("舛\u0001"));
            return (Collection) invoke;
        }

        @fg.l
        public final Collection<kotlin.reflect.jvm.internal.n<?>> m() {
            i0.a aVar = this.declaredNonStaticMembers;
            kotlin.reflect.o<Object> oVar = f78742w[9];
            Object invoke = aVar.invoke();
            kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("舛\u0001"));
            return (Collection) invoke;
        }

        @fg.l
        public final kotlin.reflect.jvm.internal.impl.descriptors.e o() {
            i0.a aVar = this.descriptor;
            kotlin.reflect.o<Object> oVar = f78742w[0];
            Object invoke = aVar.invoke();
            kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("舛\u0001"));
            return (kotlin.reflect.jvm.internal.impl.descriptors.e) invoke;
        }

        @fg.l
        public final Collection<kotlin.reflect.d<?>> r() {
            i0.a aVar = this.nestedClasses;
            kotlin.reflect.o<Object> oVar = f78742w[5];
            Object invoke = aVar.invoke();
            kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("舛\u0001"));
            return (Collection) invoke;
        }

        @fg.m
        public final T s() {
            return (T) this.objectInstance.getValue();
        }

        @fg.m
        public final String t() {
            i0.a aVar = this.qualifiedName;
            kotlin.reflect.o<Object> oVar = f78742w[3];
            return (String) aVar.invoke();
        }

        @fg.l
        public final List<kotlin.reflect.d<? extends T>> u() {
            i0.a aVar = this.sealedSubclasses;
            kotlin.reflect.o<Object> oVar = f78742w[8];
            Object invoke = aVar.invoke();
            kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("舛\u0001"));
            return (List) invoke;
        }

        @fg.m
        public final String v() {
            i0.a aVar = this.simpleName;
            kotlin.reflect.o<Object> oVar = f78742w[2];
            return (String) aVar.invoke();
        }

        @fg.l
        public final List<kotlin.reflect.s> w() {
            i0.a aVar = this.supertypes;
            kotlin.reflect.o<Object> oVar = f78742w[7];
            Object invoke = aVar.invoke();
            kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("舛\u0001"));
            return (List) invoke;
        }

        @fg.l
        public final List<kotlin.reflect.t> x() {
            i0.a aVar = this.typeParameters;
            kotlin.reflect.o<Object> oVar = f78742w[6];
            Object invoke = aVar.invoke();
            kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("舛\u0001"));
            return (List) invoke;
        }
    }

    /* compiled from: KClassImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78788a;

        static {
            int[] iArr = new int[a.EnumC1104a.values().length];
            try {
                iArr[a.EnumC1104a.FILE_FACADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC1104a.MULTIFILE_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.EnumC1104a.MULTIFILE_CLASS_PART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.EnumC1104a.SYNTHETIC_CLASS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.EnumC1104a.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.EnumC1104a.CLASS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f78788a = iArr;
        }
    }

    /* compiled from: KClassImpl.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"kotlin/reflect/jvm/internal/o$c", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/e;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/z;", "j", "()Ljava/util/List;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.reflect.jvm.internal.impl.resolve.scopes.e {
        c(kotlin.reflect.jvm.internal.impl.descriptors.impl.h hVar, kotlin.reflect.jvm.internal.impl.storage.n nVar) {
            super(nVar, hVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.e
        @fg.l
        protected List<kotlin.reflect.jvm.internal.impl.descriptors.z> j() {
            return kotlin.collections.j0.f74919b;
        }
    }

    /* compiled from: KClassImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\f0\u0002R\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lkotlin/reflect/jvm/internal/o$a;", "Lkotlin/reflect/jvm/internal/o;", "a", "()Lkotlin/reflect/jvm/internal/o$a;"}, k = 3, mv = {1, 9, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.a<o<T>.a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o<T> f78789b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(o<T> oVar) {
            super(0);
            this.f78789b = oVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o<T>.a invoke() {
            return this.f78789b.new a();
        }
    }

    /* compiled from: KClassImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class e extends kotlin.jvm.internal.g0 implements ld.p<kotlin.reflect.jvm.internal.impl.serialization.deserialization.y, a.n, u0> {

        /* renamed from: d, reason: collision with root package name */
        public static final e f78790d = new e(2);

        e() {
            super(2);
        }

        @Override // ld.p
        @fg.l
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final u0 invoke(@fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.y yVar, @fg.l a.n nVar) {
            kotlin.jvm.internal.l0.p(yVar, ProtectedSandApp.s("舜\u0001"));
            kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("舝\u0001"));
            return yVar.l(nVar);
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.c
        @fg.l
        public final String getName() {
            return ProtectedSandApp.s("舞\u0001");
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final kotlin.reflect.h getOwner() {
            return l1.d(kotlin.reflect.jvm.internal.impl.serialization.deserialization.y.class);
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final String getSignature() {
            return ProtectedSandApp.s("舟\u0001");
        }
    }

    public o(@fg.l Class<T> cls) {
        kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("舠\u0001"));
        this.jClass = cls;
        this.data = kotlin.c0.b(kotlin.f0.PUBLICATION, new d(this));
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.e h0(kotlin.reflect.jvm.internal.impl.name.b classId, kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k moduleData) {
        kotlin.reflect.jvm.internal.impl.descriptors.h0 b5 = moduleData.b();
        kotlin.reflect.jvm.internal.impl.name.c h4 = classId.h();
        kotlin.jvm.internal.l0.o(h4, ProtectedSandApp.s("舡\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.impl.h hVar = new kotlin.reflect.jvm.internal.impl.descriptors.impl.h(new kotlin.reflect.jvm.internal.impl.descriptors.impl.m(b5, h4), classId.j(), kotlin.reflect.jvm.internal.impl.descriptors.e0.FINAL, kotlin.reflect.jvm.internal.impl.descriptors.f.CLASS, kotlin.collections.w.k(moduleData.b().p().h().r()), a1.f75900a, false, moduleData.a().u());
        hVar.L0(new c(moduleData.a().u(), hVar), kotlin.collections.l0.f74939b, null);
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.e i0(kotlin.reflect.jvm.internal.impl.name.b classId, kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k moduleData) {
        kotlin.reflect.jvm.internal.impl.load.kotlin.header.a o4;
        if (this.jClass.isSynthetic()) {
            return h0(classId, moduleData);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f a5 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f.f76210c.a(this.jClass);
        a.EnumC1104a c5 = (a5 == null || (o4 = a5.o()) == null) ? null : o4.c();
        int i4 = c5 == null ? -1 : b.f78788a[c5.ordinal()];
        String s4 = ProtectedSandApp.s("舢\u0001");
        switch (i4) {
            case -1:
            case 6:
                throw new g0(ProtectedSandApp.s("舤\u0001") + this.jClass + s4 + c5 + ')');
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
            case 4:
                return h0(classId, moduleData);
            case 5:
                throw new g0(ProtectedSandApp.s("舣\u0001") + this.jClass + s4 + c5 + ')');
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.name.b j0() {
        return l0.f78709a.c(this.jClass);
    }

    @Override // kotlin.reflect.d
    public boolean C() {
        return i().C();
    }

    @Override // kotlin.reflect.d
    @fg.l
    public Collection<kotlin.reflect.d<?>> D() {
        return this.data.getValue().r();
    }

    @Override // kotlin.reflect.d
    @fg.m
    public T E() {
        return this.data.getValue().s();
    }

    @Override // kotlin.reflect.d
    public boolean F() {
        return i().e0();
    }

    @Override // kotlin.reflect.d
    @fg.m
    public String N() {
        return this.data.getValue().t();
    }

    @Override // kotlin.reflect.jvm.internal.r
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.l> R() {
        kotlin.reflect.jvm.internal.impl.descriptors.e i4 = i();
        if (i4.b() == kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE || i4.b() == kotlin.reflect.jvm.internal.impl.descriptors.f.OBJECT) {
            return kotlin.collections.j0.f74919b;
        }
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> h4 = i4.h();
        kotlin.jvm.internal.l0.o(h4, ProtectedSandApp.s("舥\u0001"));
        return h4;
    }

    @Override // kotlin.reflect.jvm.internal.r
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.z> S(@fg.l kotlin.reflect.jvm.internal.impl.name.f name) {
        kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("舦\u0001"));
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h m02 = m0();
        ud.d dVar = ud.d.FROM_REFLECTION;
        return kotlin.collections.w.D4(m02.a(name, dVar), n0().a(name, dVar));
    }

    @Override // kotlin.reflect.jvm.internal.r
    @fg.m
    public u0 T(int index) {
        Class<?> declaringClass;
        if (kotlin.jvm.internal.l0.g(this.jClass.getSimpleName(), ProtectedSandApp.s("舧\u0001")) && (declaringClass = this.jClass.getDeclaringClass()) != null && declaringClass.isInterface()) {
            kotlin.reflect.d i4 = kd.b.i(declaringClass);
            kotlin.jvm.internal.l0.n(i4, ProtectedSandApp.s("舨\u0001"));
            return ((o) i4).T(index);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e i5 = i();
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e eVar = i5 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e ? (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e) i5 : null;
        if (eVar == null) {
            return null;
        }
        a.c b12 = eVar.b1();
        h.g<a.c, List<a.n>> gVar = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f77456j;
        kotlin.jvm.internal.l0.o(gVar, ProtectedSandApp.s("舩\u0001"));
        a.n nVar = (a.n) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.b(b12, gVar, index);
        if (nVar != null) {
            return (u0) p0.h(this.jClass, nVar, eVar.a1().g(), eVar.a1().j(), eVar.d1(), e.f78790d);
        }
        return null;
    }

    @Override // kotlin.reflect.d
    @fg.m
    public String W() {
        return this.data.getValue().v();
    }

    @Override // kotlin.reflect.jvm.internal.r
    @fg.l
    public Collection<u0> X(@fg.l kotlin.reflect.jvm.internal.impl.name.f name) {
        kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("舦\u0001"));
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h m02 = m0();
        ud.d dVar = ud.d.FROM_REFLECTION;
        return kotlin.collections.w.D4(m02.b(name, dVar), n0().b(name, dVar));
    }

    @Override // kotlin.jvm.internal.t
    @fg.l
    public Class<T> e() {
        return this.jClass;
    }

    @Override // kotlin.reflect.d
    public boolean equals(@fg.m Object other) {
        return (other instanceof o) && kotlin.jvm.internal.l0.g(kd.b.g(this), kd.b.g((kotlin.reflect.d) other));
    }

    @Override // kotlin.reflect.b
    @fg.l
    public List<Annotation> getAnnotations() {
        return this.data.getValue().j();
    }

    @Override // kotlin.reflect.d
    @fg.l
    public List<kotlin.reflect.t> getTypeParameters() {
        return this.data.getValue().x();
    }

    @Override // kotlin.reflect.d
    @fg.m
    public kotlin.reflect.w getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.u visibility = i().getVisibility();
        kotlin.jvm.internal.l0.o(visibility, ProtectedSandApp.s("航\u0001"));
        return p0.t(visibility);
    }

    @Override // kotlin.reflect.d
    @fg.l
    public Collection<kotlin.reflect.i<T>> h() {
        return this.data.getValue().k();
    }

    @Override // kotlin.reflect.d
    public int hashCode() {
        return kd.b.g(this).hashCode();
    }

    @Override // kotlin.reflect.d
    public boolean isAbstract() {
        return i().u() == kotlin.reflect.jvm.internal.impl.descriptors.e0.ABSTRACT;
    }

    @Override // kotlin.reflect.d
    public boolean isFinal() {
        return i().u() == kotlin.reflect.jvm.internal.impl.descriptors.e0.FINAL;
    }

    @Override // kotlin.reflect.d
    public boolean isOpen() {
        return i().u() == kotlin.reflect.jvm.internal.impl.descriptors.e0.OPEN;
    }

    @Override // kotlin.reflect.d
    @fg.l
    public List<kotlin.reflect.s> j() {
        return this.data.getValue().w();
    }

    @fg.l
    public final kotlin.b0<o<T>.a> k0() {
        return this.data;
    }

    @Override // kotlin.reflect.jvm.internal.p
    @fg.l
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.e i() {
        return this.data.getValue().o();
    }

    @Override // kotlin.reflect.d
    @fg.l
    public List<kotlin.reflect.d<? extends T>> m() {
        return this.data.getValue().u();
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h m0() {
        return i().r().q();
    }

    @Override // kotlin.reflect.d
    public boolean n() {
        return i().n();
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h n0() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h o02 = i().o0();
        kotlin.jvm.internal.l0.o(o02, ProtectedSandApp.s("舫\u0001"));
        return o02;
    }

    @Override // kotlin.reflect.d
    public boolean p() {
        return i().u() == kotlin.reflect.jvm.internal.impl.descriptors.e0.SEALED;
    }

    @Override // kotlin.reflect.d
    public boolean q(@fg.m Object value) {
        Integer c5 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.c(this.jClass);
        if (c5 != null) {
            return u1.B(value, c5.intValue());
        }
        Class g4 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.g(this.jClass);
        if (g4 == null) {
            g4 = this.jClass;
        }
        return g4.isInstance(value);
    }

    @Override // kotlin.reflect.h
    @fg.l
    public Collection<kotlin.reflect.c<?>> r() {
        return this.data.getValue().g();
    }

    @fg.l
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("般\u0001"));
        kotlin.reflect.jvm.internal.impl.name.b j02 = j0();
        kotlin.reflect.jvm.internal.impl.name.c h4 = j02.h();
        kotlin.jvm.internal.l0.o(h4, ProtectedSandApp.s("舡\u0001"));
        if (h4.d()) {
            str = "";
        } else {
            str = h4.b() + '.';
        }
        String b5 = j02.i().b();
        kotlin.jvm.internal.l0.o(b5, ProtectedSandApp.s("舭\u0001"));
        sb.append(str + kotlin.text.v.h2(b5, '.', '$', false, 4, null));
        return sb.toString();
    }

    @Override // kotlin.reflect.d
    public boolean v() {
        return i().v();
    }

    @Override // kotlin.reflect.d
    public boolean w() {
        return i().w();
    }
}
