package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.u1;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.a;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.k;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.p;
import kotlin.text.Typography;

/* compiled from: KClassImpl.kt */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00052\u00020\u0006:\u0001MB\u0015\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\bo\u0010pJ\b\u0010\b\u001a\u00020\u0007H\u0002J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0016J\u0013\u0010\u0017\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016R \u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR9\u0010(\u001a$\u0012 \u0012\u001e #*\u000e\u0018\u00010\"R\b\u0012\u0004\u0012\u00028\u00000\u00000\"R\b\u0012\u0004\u0012\u00028\u00000\u00000!8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001e\u00101\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030.0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u001a\u00104\u001a\b\u0012\u0004\u0012\u0002020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00100R\u0016\u00107\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0016\u00109\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00106R \u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000:0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00100R\u001e\u0010>\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u00100R\u0016\u0010@\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010?R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020A0)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010,R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020D0)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010,R\"\u0010H\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00040)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010,R\u0016\u0010L\u001a\u0004\u0018\u00010I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010NR\u0014\u0010R\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010NR\u0014\u0010T\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010NR\u0014\u0010V\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010NR\u0014\u0010X\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010NR\u0014\u0010Z\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010NR\u0014\u0010\\\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010NR\u001a\u0010`\u001a\u00020\u00148VX\u0096\u0004¢\u0006\f\u0012\u0004\b^\u0010_\u001a\u0004\b]\u0010NR\u0014\u0010d\u001a\u00020a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010l\u001a\u00020i8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0014\u0010n\u001a\u00020i8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bm\u0010k¨\u0006q"}, d2 = {"Lkotlin/reflect/jvm/internal/m;", "", "T", "Lkotlin/reflect/jvm/internal/p;", "Lkotlin/reflect/d;", "Lkotlin/reflect/jvm/internal/n;", "Lkotlin/reflect/jvm/internal/d0;", "", "z0", "Lkotlin/reflect/jvm/internal/impl/name/f;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "f0", "Lkotlin/reflect/jvm/internal/impl/descriptors/z;", "a0", "", "index", "b0", "value", "", "j0", "other", "equals", "hashCode", "", "toString", "Ljava/lang/Class;", "r", "Ljava/lang/Class;", "f", "()Ljava/lang/Class;", "jClass", "Lkotlin/reflect/jvm/internal/g0$b;", "Lkotlin/reflect/jvm/internal/m$a;", "kotlin.jvm.PlatformType", "s", "Lkotlin/reflect/jvm/internal/g0$b;", "v0", "()Lkotlin/reflect/jvm/internal/g0$b;", "data", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "Lkotlin/reflect/c;", "A", "()Ljava/util/Collection;", "members", "Lkotlin/reflect/jvm/internal/impl/descriptors/l;", "Y", "constructorDescriptors", "R", "()Ljava/lang/String;", "simpleName", "J", "qualifiedName", "Lkotlin/reflect/i;", "l", "constructors", "K", "nestedClasses", "()Ljava/lang/Object;", "objectInstance", "Lkotlin/reflect/t;", "getTypeParameters", "typeParameters", "Lkotlin/reflect/s;", "m", "supertypes", "w", "sealedSubclasses", "Lkotlin/reflect/w;", "c", "()Lkotlin/reflect/w;", "visibility", "a", "()Z", "isFinal", "isOpen", "d", "isAbstract", "t", "isSealed", "I", "isData", "y", "isInner", "Z", "isCompanion", "u", "isFun", "x", "isValue$annotations", "()V", "isValue", "Lkotlin/reflect/jvm/internal/impl/name/b;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "classId", "Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "memberScope", "getStaticScope$kotlin_reflection", "staticScope", "<init>", "(Ljava/lang/Class;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class m<T> extends p implements KClass<T>, n, d0 {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Class<T> jClass;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final g0.b<m<T>.a> data;

    /* compiled from: KClassImpl.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\bA\u0010BJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002R\u001b\u0010\f\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0017\u0010\u0014R-\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0\u00198FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\t\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR%\u0010$\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030!0\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\t\u001a\u0004\b#\u0010\u001dR#\u0010)\u001a\u0004\u0018\u00018\u00008FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010%\u0012\u0004\b(\u0010\u001f\u001a\u0004\b&\u0010'R!\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\t\u001a\u0004\b+\u0010\u0011R!\u00100\u001a\b\u0012\u0004\u0012\u00020-0\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\t\u001a\u0004\b/\u0010\u0011R)\u00103\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000!0\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\t\u001a\u0004\b2\u0010\u0011R%\u00106\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\t\u001a\u0004\b1\u0010\u001dR%\u00108\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\t\u001a\u0004\b5\u0010\u001dR%\u0010:\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\t\u001a\u0004\b9\u0010\u001dR%\u0010<\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\t\u001a\u0004\b;\u0010\u001dR%\u0010=\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\t\u001a\u0004\b\u001b\u0010\u001dR%\u0010>\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\t\u001a\u0004\b\"\u0010\u001dR%\u0010?\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b.\u0010\u001dR%\u0010@\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\t\u001a\u0004\b\u0016\u0010\u001d¨\u0006C"}, d2 = {"Lkotlin/reflect/jvm/internal/m$a;", "Lkotlin/reflect/jvm/internal/p$b;", "Lkotlin/reflect/jvm/internal/p;", "Ljava/lang/Class;", "jClass", "", "f", "Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "d", "Lkotlin/reflect/jvm/internal/g0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "", "", "e", "j", "()Ljava/util/List;", "annotations", "v", "()Ljava/lang/String;", "simpleName", "g", "t", "qualifiedName", "", "Lkotlin/reflect/i;", "h", "k", "()Ljava/util/Collection;", "getConstructors$annotations", "()V", "constructors", "Lkotlin/reflect/d;", "i", "r", "nestedClasses", "Lkotlin/reflect/jvm/internal/g0$b;", "s", "()Ljava/lang/Object;", "getObjectInstance$annotations", "objectInstance", "Lkotlin/reflect/t;", "x", "typeParameters", "Lkotlin/reflect/s;", "l", "w", "supertypes", "m", "u", "sealedSubclasses", "Lkotlin/reflect/jvm/internal/l;", "n", "declaredNonStaticMembers", "o", "declaredStaticMembers", "p", "inheritedNonStaticMembers", "q", "inheritedStaticMembers", "allNonStaticMembers", "allStaticMembers", "declaredMembers", "allMembers", "<init>", "(Lkotlin/reflect/jvm/internal/m;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes5.dex */
    public final class a extends p.b {

        /* renamed from: w, reason: collision with root package name */
        static final /* synthetic */ KProperty<Object>[] f26724w = {l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("奷"), ProtectedSandApp.s("奸"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("她"), ProtectedSandApp.s("奺"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("奻"), ProtectedSandApp.s("奼"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("好"), ProtectedSandApp.s("奾"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("奿"), ProtectedSandApp.s("妀"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("妁"), ProtectedSandApp.s("如"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("妃"), ProtectedSandApp.s("妄"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("妅"), ProtectedSandApp.s("妆"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("妇"), ProtectedSandApp.s("妈"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("妉"), ProtectedSandApp.s("妊"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("妋"), ProtectedSandApp.s("妌"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("妍"), ProtectedSandApp.s("妎"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("妏"), ProtectedSandApp.s("妐"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("妑"), ProtectedSandApp.s("妒"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("妓"), ProtectedSandApp.s("妔"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("妕"), ProtectedSandApp.s("妖"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("妗"), ProtectedSandApp.s("妘"))), l1.u(new g1(l1.d(a.class), ProtectedSandApp.s("妙"), ProtectedSandApp.s("妚")))};

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.a descriptor;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.a annotations;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.a simpleName;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.a qualifiedName;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.a constructors;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.a nestedClasses;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.b objectInstance;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.a typeParameters;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.a supertypes;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.a sealedSubclasses;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.a declaredNonStaticMembers;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.a declaredStaticMembers;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.a inheritedNonStaticMembers;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.a inheritedStaticMembers;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.a allNonStaticMembers;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.a allStaticMembers;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.a declaredMembers;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.a allMembers;

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/l;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlin.reflect.jvm.internal.m$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        static final class C0400a extends Lambda implements q3.a<List<? extends kotlin.reflect.jvm.internal.l<?>>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ m<T>.a f26744p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0400a(m<T>.a aVar) {
                super(0);
                this.f26744p = aVar;
            }

            @Override // q3.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<kotlin.reflect.jvm.internal.l<?>> n() {
                List<kotlin.reflect.jvm.internal.l<?>> D4;
                D4 = kotlin.collections.j0.D4(this.f26744p.h(), this.f26744p.i());
                return D4;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/l;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        static final class b extends Lambda implements q3.a<List<? extends kotlin.reflect.jvm.internal.l<?>>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ m<T>.a f26745p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(m<T>.a aVar) {
                super(0);
                this.f26745p = aVar;
            }

            @Override // q3.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<kotlin.reflect.jvm.internal.l<?>> n() {
                List<kotlin.reflect.jvm.internal.l<?>> D4;
                D4 = kotlin.collections.j0.D4(this.f26745p.m(), this.f26745p.p());
                return D4;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/l;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        static final class c extends Lambda implements q3.a<List<? extends kotlin.reflect.jvm.internal.l<?>>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ m<T>.a f26746p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(m<T>.a aVar) {
                super(0);
                this.f26746p = aVar;
            }

            @Override // q3.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<kotlin.reflect.jvm.internal.l<?>> n() {
                List<kotlin.reflect.jvm.internal.l<?>> D4;
                D4 = kotlin.collections.j0.D4(this.f26746p.n(), this.f26746p.q());
                return D4;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        static final class d extends Lambda implements q3.a<List<? extends Annotation>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ m<T>.a f26747p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(m<T>.a aVar) {
                super(0);
                this.f26747p = aVar;
            }

            @Override // q3.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<Annotation> n() {
                return n0.e(this.f26747p.o());
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/i;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        static final class e extends Lambda implements q3.a<List<? extends KFunction<? extends T>>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ m<T> f26748p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(m<T> mVar) {
                super(0);
                this.f26748p = mVar;
            }

            @Override // q3.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<KFunction<T>> n() {
                int b02;
                Collection<kotlin.reflect.jvm.internal.impl.descriptors.l> Y = this.f26748p.Y();
                m<T> mVar = this.f26748p;
                b02 = kotlin.collections.b0.b0(Y, 10);
                ArrayList arrayList = new ArrayList(b02);
                Iterator<T> it = Y.iterator();
                while (it.hasNext()) {
                    arrayList.add(new kotlin.reflect.jvm.internal.q(mVar, (kotlin.reflect.jvm.internal.impl.descriptors.l) it.next()));
                }
                return arrayList;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/l;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        static final class f extends Lambda implements q3.a<List<? extends kotlin.reflect.jvm.internal.l<?>>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ m<T>.a f26749p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(m<T>.a aVar) {
                super(0);
                this.f26749p = aVar;
            }

            @Override // q3.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<kotlin.reflect.jvm.internal.l<?>> n() {
                List<kotlin.reflect.jvm.internal.l<?>> D4;
                D4 = kotlin.collections.j0.D4(this.f26749p.m(), this.f26749p.n());
                return D4;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/l;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/Collection;"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        static final class g extends Lambda implements q3.a<Collection<? extends kotlin.reflect.jvm.internal.l<?>>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ m<T> f26750p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(m<T> mVar) {
                super(0);
                this.f26750p = mVar;
            }

            @Override // q3.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<kotlin.reflect.jvm.internal.l<?>> n() {
                m<T> mVar = this.f26750p;
                return mVar.d0(mVar.x0(), p.c.DECLARED);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/l;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/Collection;"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        static final class h extends Lambda implements q3.a<Collection<? extends kotlin.reflect.jvm.internal.l<?>>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ m<T> f26751p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(m<T> mVar) {
                super(0);
                this.f26751p = mVar;
            }

            @Override // q3.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<kotlin.reflect.jvm.internal.l<?>> n() {
                m<T> mVar = this.f26751p;
                return mVar.d0(mVar.y0(), p.c.DECLARED);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/e;"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        static final class i extends Lambda implements q3.a<kotlin.reflect.jvm.internal.impl.descriptors.e> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ m<T> f26752p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(m<T> mVar) {
                super(0);
                this.f26752p = mVar;
            }

            @Override // q3.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.descriptors.e n() {
                kotlin.reflect.jvm.internal.impl.name.b u02 = this.f26752p.u0();
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k a6 = this.f26752p.v0().n().a();
                kotlin.reflect.jvm.internal.impl.descriptors.e b6 = u02.k() ? a6.a().b(u02) : kotlin.reflect.jvm.internal.impl.descriptors.y.a(a6.b(), u02);
                if (b6 != null) {
                    return b6;
                }
                this.f26752p.z0();
                throw null;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/l;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/Collection;"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        static final class j extends Lambda implements q3.a<Collection<? extends kotlin.reflect.jvm.internal.l<?>>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ m<T> f26753p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(m<T> mVar) {
                super(0);
                this.f26753p = mVar;
            }

            @Override // q3.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<kotlin.reflect.jvm.internal.l<?>> n() {
                m<T> mVar = this.f26753p;
                return mVar.d0(mVar.x0(), p.c.INHERITED);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/l;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/Collection;"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        static final class k extends Lambda implements q3.a<Collection<? extends kotlin.reflect.jvm.internal.l<?>>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ m<T> f26754p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(m<T> mVar) {
                super(0);
                this.f26754p = mVar;
            }

            @Override // q3.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<kotlin.reflect.jvm.internal.l<?>> n() {
                m<T> mVar = this.f26754p;
                return mVar.d0(mVar.y0(), p.c.INHERITED);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a6\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00000\u00000\u0003 \u0004*\u001a\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00000\u00000\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/m;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        static final class l extends Lambda implements q3.a<List<? extends m<? extends Object>>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ m<T>.a f26755p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            l(m<T>.a aVar) {
                super(0);
                this.f26755p = aVar;
            }

            @Override // q3.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<m<? extends Object>> n() {
                kotlin.reflect.jvm.internal.impl.resolve.scopes.h F0 = this.f26755p.o().F0();
                kotlin.jvm.internal.l0.o(F0, ProtectedSandApp.s("訄"));
                Collection a6 = k.a.a(F0, null, null, 3, null);
                ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.m> arrayList = new ArrayList();
                for (T t5 : a6) {
                    if (!kotlin.reflect.jvm.internal.impl.resolve.e.B((kotlin.reflect.jvm.internal.impl.descriptors.m) t5)) {
                        arrayList.add(t5);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (kotlin.reflect.jvm.internal.impl.descriptors.m mVar : arrayList) {
                    kotlin.reflect.jvm.internal.impl.descriptors.e eVar = mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) mVar : null;
                    Class<?> p5 = eVar != null ? n0.p(eVar) : null;
                    m mVar2 = p5 != null ? new m(p5) : null;
                    if (mVar2 != null) {
                        arrayList2.add(mVar2);
                    }
                }
                return arrayList2;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "T", "n", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlin.reflect.jvm.internal.m$a$m, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        static final class C0401m extends Lambda implements q3.a<T> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ m<T>.a f26756p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ m<T> f26757q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0401m(m<T>.a aVar, m<T> mVar) {
                super(0);
                this.f26756p = aVar;
                this.f26757q = mVar;
            }

            @Override // q3.a
            @d5.e
            public final T n() {
                kotlin.reflect.jvm.internal.impl.descriptors.e o5 = this.f26756p.o();
                if (o5.j() != kotlin.reflect.jvm.internal.impl.descriptors.f.OBJECT) {
                    return null;
                }
                T t5 = (T) ((!o5.L() || kotlin.reflect.jvm.internal.impl.builtins.d.a(kotlin.reflect.jvm.internal.impl.builtins.c.f23889a, o5)) ? this.f26757q.f().getDeclaredField(ProtectedSandApp.s("訅")) : this.f26757q.f().getEnclosingClass().getDeclaredField(o5.getName().h())).get(null);
                kotlin.jvm.internal.l0.n(t5, ProtectedSandApp.s("訆"));
                return t5;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        static final class n extends Lambda implements q3.a<String> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ m<T> f26758p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(m<T> mVar) {
                super(0);
                this.f26758p = mVar;
            }

            @Override // q3.a
            @d5.e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String n() {
                if (this.f26758p.f().isAnonymousClass()) {
                    return null;
                }
                kotlin.reflect.jvm.internal.impl.name.b u02 = this.f26758p.u0();
                if (u02.k()) {
                    return null;
                }
                return u02.b().b();
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a&\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003 \u0004*\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/m;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        static final class o extends Lambda implements q3.a<List<? extends m<? extends T>>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ m<T>.a f26759p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            o(m<T>.a aVar) {
                super(0);
                this.f26759p = aVar;
            }

            @Override // q3.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<m<? extends T>> n() {
                Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> w5 = this.f26759p.o().w();
                kotlin.jvm.internal.l0.o(w5, ProtectedSandApp.s("訇"));
                ArrayList arrayList = new ArrayList();
                for (kotlin.reflect.jvm.internal.impl.descriptors.e eVar : w5) {
                    kotlin.jvm.internal.l0.n(eVar, ProtectedSandApp.s("計"));
                    Class<?> p5 = n0.p(eVar);
                    m mVar = p5 != null ? new m(p5) : null;
                    if (mVar != null) {
                        arrayList.add(mVar);
                    }
                }
                return arrayList;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        static final class p extends Lambda implements q3.a<String> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ m<T> f26760p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ m<T>.a f26761q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            p(m<T> mVar, m<T>.a aVar) {
                super(0);
                this.f26760p = mVar;
                this.f26761q = aVar;
            }

            @Override // q3.a
            @d5.e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String n() {
                if (this.f26760p.f().isAnonymousClass()) {
                    return null;
                }
                kotlin.reflect.jvm.internal.impl.name.b u02 = this.f26760p.u0();
                if (u02.k()) {
                    return this.f26761q.f(this.f26760p.f());
                }
                String h5 = u02.j().h();
                kotlin.jvm.internal.l0.o(h5, ProtectedSandApp.s("訉"));
                return h5;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/b0;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        static final class q extends Lambda implements q3.a<List<? extends b0>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ m<T>.a f26762p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ m<T> f26763q;

            /* compiled from: KClassImpl.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: kotlin.reflect.jvm.internal.m$a$q$a, reason: collision with other inner class name */
            static final class C0402a extends Lambda implements q3.a<Type> {

                /* renamed from: p, reason: collision with root package name */
                final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.h0 f26764p;

                /* renamed from: q, reason: collision with root package name */
                final /* synthetic */ m<T>.a f26765q;

                /* renamed from: r, reason: collision with root package name */
                final /* synthetic */ m<T> f26766r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0402a(kotlin.reflect.jvm.internal.impl.types.h0 h0Var, m<T>.a aVar, m<T> mVar) {
                    super(0);
                    this.f26764p = h0Var;
                    this.f26765q = aVar;
                    this.f26766r = mVar;
                }

                @Override // q3.a
                @d5.d
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Type n() {
                    int If;
                    kotlin.reflect.jvm.internal.impl.descriptors.h b6 = this.f26764p.U0().b();
                    if (!(b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
                        throw new e0(ProtectedSandApp.s("訑") + b6);
                    }
                    Class<?> p5 = n0.p((kotlin.reflect.jvm.internal.impl.descriptors.e) b6);
                    if (p5 == null) {
                        throw new e0(ProtectedSandApp.s("訏") + this.f26765q + ProtectedSandApp.s("訐") + b6);
                    }
                    if (kotlin.jvm.internal.l0.g(this.f26766r.f().getSuperclass(), p5)) {
                        Type genericSuperclass = this.f26766r.f().getGenericSuperclass();
                        kotlin.jvm.internal.l0.o(genericSuperclass, ProtectedSandApp.s("訊"));
                        return genericSuperclass;
                    }
                    Class<?>[] interfaces = this.f26766r.f().getInterfaces();
                    kotlin.jvm.internal.l0.o(interfaces, ProtectedSandApp.s("訋"));
                    If = kotlin.collections.t.If(interfaces, p5);
                    if (If >= 0) {
                        Type type = this.f26766r.f().getGenericInterfaces()[If];
                        kotlin.jvm.internal.l0.o(type, ProtectedSandApp.s("訌"));
                        return type;
                    }
                    throw new e0(ProtectedSandApp.s("訍") + this.f26765q + ProtectedSandApp.s("討") + b6);
                }
            }

            /* compiled from: KClassImpl.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;"}, k = 3, mv = {1, 8, 0})
            static final class b extends Lambda implements q3.a<Type> {

                /* renamed from: p, reason: collision with root package name */
                public static final b f26767p = new b();

                b() {
                    super(0);
                }

                @d5.d
                public final Type a() {
                    return Object.class;
                }

                @Override // q3.a
                public Type n() {
                    return Object.class;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            q(m<T>.a aVar, m<T> mVar) {
                super(0);
                this.f26762p = aVar;
                this.f26763q = mVar;
            }

            @Override // q3.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<b0> n() {
                Collection<kotlin.reflect.jvm.internal.impl.types.h0> m5 = this.f26762p.o().m().m();
                kotlin.jvm.internal.l0.o(m5, ProtectedSandApp.s("訒"));
                ArrayList arrayList = new ArrayList(m5.size());
                m<T>.a aVar = this.f26762p;
                m<T> mVar = this.f26763q;
                for (kotlin.reflect.jvm.internal.impl.types.h0 h0Var : m5) {
                    kotlin.jvm.internal.l0.o(h0Var, ProtectedSandApp.s("訓"));
                    arrayList.add(new b0(h0Var, new C0402a(h0Var, aVar, mVar)));
                }
                if (!kotlin.reflect.jvm.internal.impl.builtins.h.t0(this.f26762p.o())) {
                    boolean z5 = true;
                    if (!arrayList.isEmpty()) {
                        Iterator<T> it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            kotlin.reflect.jvm.internal.impl.descriptors.f j5 = kotlin.reflect.jvm.internal.impl.resolve.e.e(((b0) it.next()).getType()).j();
                            kotlin.jvm.internal.l0.o(j5, ProtectedSandApp.s("訔"));
                            if (!(j5 == kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE || j5 == kotlin.reflect.jvm.internal.impl.descriptors.f.ANNOTATION_CLASS)) {
                                z5 = false;
                                break;
                            }
                        }
                    }
                    if (z5) {
                        p0 i5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(this.f26762p.o()).i();
                        kotlin.jvm.internal.l0.o(i5, ProtectedSandApp.s("訕"));
                        arrayList.add(new b0(i5, b.f26767p));
                    }
                }
                return kotlin.reflect.jvm.internal.impl.utils.a.c(arrayList);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/c0;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        static final class r extends Lambda implements q3.a<List<? extends c0>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ m<T>.a f26768p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ m<T> f26769q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            r(m<T>.a aVar, m<T> mVar) {
                super(0);
                this.f26768p = aVar;
                this.f26769q = mVar;
            }

            @Override // q3.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<c0> n() {
                int b02;
                List<f1> G = this.f26768p.o().G();
                kotlin.jvm.internal.l0.o(G, ProtectedSandApp.s("訖"));
                m<T> mVar = this.f26769q;
                b02 = kotlin.collections.b0.b0(G, 10);
                ArrayList arrayList = new ArrayList(b02);
                for (f1 f1Var : G) {
                    kotlin.jvm.internal.l0.o(f1Var, ProtectedSandApp.s("託"));
                    arrayList.add(new c0(mVar, f1Var));
                }
                return arrayList;
            }
        }

        public a() {
            super();
            this.descriptor = g0.d(new i(m.this));
            this.annotations = g0.d(new d(this));
            this.simpleName = g0.d(new p(m.this, this));
            this.qualifiedName = g0.d(new n(m.this));
            this.constructors = g0.d(new e(m.this));
            this.nestedClasses = g0.d(new l(this));
            this.objectInstance = g0.b(new C0401m(this, m.this));
            this.typeParameters = g0.d(new r(this, m.this));
            this.supertypes = g0.d(new q(this, m.this));
            this.sealedSubclasses = g0.d(new o(this));
            this.declaredNonStaticMembers = g0.d(new g(m.this));
            this.declaredStaticMembers = g0.d(new h(m.this));
            this.inheritedNonStaticMembers = g0.d(new j(m.this));
            this.inheritedStaticMembers = g0.d(new k(m.this));
            this.allNonStaticMembers = g0.d(new b(this));
            this.allStaticMembers = g0.d(new c(this));
            this.declaredMembers = g0.d(new f(this));
            this.allMembers = g0.d(new C0400a(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(Class<?> jClass) {
            String m5;
            String n5;
            String n52;
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            String s5 = ProtectedSandApp.s("妛");
            if (enclosingMethod != null) {
                kotlin.jvm.internal.l0.o(simpleName, s5);
                n52 = kotlin.text.h0.n5(simpleName, enclosingMethod.getName() + Typography.f27127c, null, 2, null);
                return n52;
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                kotlin.jvm.internal.l0.o(simpleName, s5);
                m5 = kotlin.text.h0.m5(simpleName, Typography.f27127c, null, 2, null);
                return m5;
            }
            kotlin.jvm.internal.l0.o(simpleName, s5);
            n5 = kotlin.text.h0.n5(simpleName, enclosingConstructor.getName() + Typography.f27127c, null, 2, null);
            return n5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Collection<kotlin.reflect.jvm.internal.l<?>> n() {
            T b6 = this.declaredStaticMembers.b(this, f26724w[11]);
            kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("妜"));
            return (Collection) b6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Collection<kotlin.reflect.jvm.internal.l<?>> p() {
            T b6 = this.inheritedNonStaticMembers.b(this, f26724w[12]);
            kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("妝"));
            return (Collection) b6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Collection<kotlin.reflect.jvm.internal.l<?>> q() {
            T b6 = this.inheritedStaticMembers.b(this, f26724w[13]);
            kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("妞"));
            return (Collection) b6;
        }

        @d5.d
        public final Collection<kotlin.reflect.jvm.internal.l<?>> g() {
            T b6 = this.allMembers.b(this, f26724w[17]);
            kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("妟"));
            return (Collection) b6;
        }

        @d5.d
        public final Collection<kotlin.reflect.jvm.internal.l<?>> h() {
            T b6 = this.allNonStaticMembers.b(this, f26724w[14]);
            kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("妠"));
            return (Collection) b6;
        }

        @d5.d
        public final Collection<kotlin.reflect.jvm.internal.l<?>> i() {
            T b6 = this.allStaticMembers.b(this, f26724w[15]);
            kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("妡"));
            return (Collection) b6;
        }

        @d5.d
        public final List<Annotation> j() {
            T b6 = this.annotations.b(this, f26724w[1]);
            kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("妢"));
            return (List) b6;
        }

        @d5.d
        public final Collection<KFunction<T>> k() {
            T b6 = this.constructors.b(this, f26724w[4]);
            kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("妣"));
            return (Collection) b6;
        }

        @d5.d
        public final Collection<kotlin.reflect.jvm.internal.l<?>> l() {
            T b6 = this.declaredMembers.b(this, f26724w[16]);
            kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("妤"));
            return (Collection) b6;
        }

        @d5.d
        public final Collection<kotlin.reflect.jvm.internal.l<?>> m() {
            T b6 = this.declaredNonStaticMembers.b(this, f26724w[10]);
            kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("妥"));
            return (Collection) b6;
        }

        @d5.d
        public final kotlin.reflect.jvm.internal.impl.descriptors.e o() {
            T b6 = this.descriptor.b(this, f26724w[0]);
            kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("妦"));
            return (kotlin.reflect.jvm.internal.impl.descriptors.e) b6;
        }

        @d5.d
        public final Collection<KClass<?>> r() {
            T b6 = this.nestedClasses.b(this, f26724w[5]);
            kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("妧"));
            return (Collection) b6;
        }

        @d5.e
        public final T s() {
            return this.objectInstance.b(this, f26724w[6]);
        }

        @d5.e
        public final String t() {
            return (String) this.qualifiedName.b(this, f26724w[3]);
        }

        @d5.d
        public final List<KClass<? extends T>> u() {
            T b6 = this.sealedSubclasses.b(this, f26724w[9]);
            kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("妨"));
            return (List) b6;
        }

        @d5.e
        public final String v() {
            return (String) this.simpleName.b(this, f26724w[2]);
        }

        @d5.d
        public final List<KType> w() {
            T b6 = this.supertypes.b(this, f26724w[8]);
            kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("妩"));
            return (List) b6;
        }

        @d5.d
        public final List<KTypeParameter> x() {
            T b6 = this.typeParameters.b(this, f26724w[7]);
            kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("妪"));
            return (List) b6;
        }
    }

    /* compiled from: KClassImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26770a;

        static {
            int[] iArr = new int[a.EnumC0299a.values().length];
            try {
                iArr[a.EnumC0299a.FILE_FACADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC0299a.MULTIFILE_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.EnumC0299a.MULTIFILE_CLASS_PART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.EnumC0299a.SYNTHETIC_CLASS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.EnumC0299a.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.EnumC0299a.CLASS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f26770a = iArr;
        }
    }

    /* compiled from: KClassImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e \u0004*\u000e\u0018\u00010\u0002R\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002R\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lkotlin/reflect/jvm/internal/m$a;", "Lkotlin/reflect/jvm/internal/m;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/m$a;"}, k = 3, mv = {1, 8, 0})
    static final class c extends Lambda implements q3.a<m<T>.a> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ m<T> f26771p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(m<T> mVar) {
            super(0);
            this.f26771p = mVar;
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m<T>.a n() {
            return this.f26771p.new a();
        }
    }

    /* compiled from: KClassImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class d extends kotlin.jvm.internal.g0 implements q3.p<kotlin.reflect.jvm.internal.impl.serialization.deserialization.x, a.n, u0> {

        /* renamed from: x, reason: collision with root package name */
        public static final d f26772x = new d();

        d() {
            super(2);
        }

        @Override // q3.p
        @d5.d
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public final u0 g0(@d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.x xVar, @d5.d a.n nVar) {
            kotlin.jvm.internal.l0.p(xVar, ProtectedSandApp.s("記"));
            kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("訙"));
            return xVar.l(nVar);
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.KCallable
        @d5.d
        public final String getName() {
            return ProtectedSandApp.s("訚");
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final KDeclarationContainer w0() {
            return l1.d(kotlin.reflect.jvm.internal.impl.serialization.deserialization.x.class);
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final String y0() {
            return ProtectedSandApp.s("訛");
        }
    }

    public m(@d5.d Class<T> cls) {
        kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("訜"));
        this.jClass = cls;
        g0.b<m<T>.a> b6 = g0.b(new c(this));
        kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("訝"));
        this.data = b6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.name.b u0() {
        return j0.f26695a.c(this.jClass);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Void z0() {
        kotlin.reflect.jvm.internal.impl.load.kotlin.header.a a6;
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f a7 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f.f24360c.a(this.jClass);
        a.EnumC0299a c6 = (a7 == null || (a6 = a7.a()) == null) ? null : a6.c();
        switch (c6 == null ? -1 : b.f26770a[c6.ordinal()]) {
            case -1:
            case 6:
                throw new e0(ProtectedSandApp.s("訢") + this.jClass);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
                throw new UnsupportedOperationException(ProtectedSandApp.s("訡") + this.jClass);
            case 4:
                throw new UnsupportedOperationException(ProtectedSandApp.s("訠") + this.jClass);
            case 5:
                throw new e0(ProtectedSandApp.s("訞") + this.jClass + ProtectedSandApp.s("訟") + c6 + ')');
        }
    }

    @Override // kotlin.reflect.KDeclarationContainer
    @d5.d
    public Collection<KCallable<?>> A() {
        return this.data.n().g();
    }

    @Override // kotlin.reflect.KClass
    public boolean I() {
        return n().I();
    }

    @Override // kotlin.reflect.KClass
    @d5.e
    public String J() {
        return this.data.n().t();
    }

    @Override // kotlin.reflect.KClass
    @d5.d
    public Collection<KClass<?>> K() {
        return this.data.n().r();
    }

    @Override // kotlin.reflect.KClass
    @d5.e
    public String R() {
        return this.data.n().v();
    }

    @Override // kotlin.reflect.KClass
    @d5.e
    public T T() {
        return this.data.n().s();
    }

    @Override // kotlin.reflect.jvm.internal.p
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.l> Y() {
        kotlin.reflect.jvm.internal.impl.descriptors.e n5 = n();
        if (n5.j() == kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE || n5.j() == kotlin.reflect.jvm.internal.impl.descriptors.f.OBJECT) {
            return EmptyList.f23167o;
        }
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> l5 = n5.l();
        kotlin.jvm.internal.l0.o(l5, ProtectedSandApp.s("訣"));
        return l5;
    }

    @Override // kotlin.reflect.KClass
    public boolean Z() {
        return n().L();
    }

    @Override // kotlin.reflect.KClass
    public boolean a() {
        return n().r() == kotlin.reflect.jvm.internal.impl.descriptors.e0.FINAL;
    }

    @Override // kotlin.reflect.jvm.internal.p
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.z> a0(@d5.d kotlin.reflect.jvm.internal.impl.name.f name) {
        List D4;
        kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("訤"));
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h x02 = x0();
        z3.d dVar = z3.d.FROM_REFLECTION;
        D4 = kotlin.collections.j0.D4(x02.a(name, dVar), y0().a(name, dVar));
        return D4;
    }

    @Override // kotlin.reflect.jvm.internal.p
    @d5.e
    public u0 b0(int index) {
        Class<?> declaringClass;
        if (kotlin.jvm.internal.l0.g(this.jClass.getSimpleName(), ProtectedSandApp.s("訥")) && (declaringClass = this.jClass.getDeclaringClass()) != null && declaringClass.isInterface()) {
            KClass i5 = p3.b.i(declaringClass);
            kotlin.jvm.internal.l0.n(i5, ProtectedSandApp.s("訦"));
            return ((m) i5).b0(index);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e n5 = n();
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e eVar = n5 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e ? (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e) n5 : null;
        if (eVar == null) {
            return null;
        }
        a.c i12 = eVar.i1();
        h.g<a.c, List<a.n>> gVar = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f25478j;
        kotlin.jvm.internal.l0.o(gVar, ProtectedSandApp.s("訧"));
        a.n nVar = (a.n) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.b(i12, gVar, index);
        if (nVar != null) {
            return (u0) n0.h(this.jClass, nVar, eVar.h1().g(), eVar.h1().j(), eVar.k1(), d.f26772x);
        }
        return null;
    }

    @Override // kotlin.reflect.KClass
    @d5.e
    public KVisibility c() {
        kotlin.reflect.jvm.internal.impl.descriptors.u c6 = n().c();
        kotlin.jvm.internal.l0.o(c6, ProtectedSandApp.s("訨"));
        return n0.q(c6);
    }

    @Override // kotlin.reflect.KClass
    public boolean d() {
        return n().r() == kotlin.reflect.jvm.internal.impl.descriptors.e0.ABSTRACT;
    }

    @Override // kotlin.reflect.KClass
    public boolean equals(@d5.e Object other) {
        return (other instanceof m) && kotlin.jvm.internal.l0.g(p3.b.g(this), p3.b.g((KClass) other));
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    @d5.d
    public Class<T> f() {
        return this.jClass;
    }

    @Override // kotlin.reflect.jvm.internal.p
    @d5.d
    public Collection<u0> f0(@d5.d kotlin.reflect.jvm.internal.impl.name.f name) {
        List D4;
        kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("訩"));
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h x02 = x0();
        z3.d dVar = z3.d.FROM_REFLECTION;
        D4 = kotlin.collections.j0.D4(x02.d(name, dVar), y0().d(name, dVar));
        return D4;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @d5.d
    public List<Annotation> getAnnotations() {
        return this.data.n().j();
    }

    @Override // kotlin.reflect.KClass
    @d5.d
    public List<KTypeParameter> getTypeParameters() {
        return this.data.n().x();
    }

    @Override // kotlin.reflect.KClass
    public int hashCode() {
        return p3.b.g(this).hashCode();
    }

    @Override // kotlin.reflect.KClass
    public boolean isOpen() {
        return n().r() == kotlin.reflect.jvm.internal.impl.descriptors.e0.OPEN;
    }

    @Override // kotlin.reflect.KClass
    public boolean j0(@d5.e Object value) {
        Integer c6 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.c(this.jClass);
        if (c6 != null) {
            return u1.B(value, c6.intValue());
        }
        Class g5 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.g(this.jClass);
        if (g5 == null) {
            g5 = this.jClass;
        }
        return g5.isInstance(value);
    }

    @Override // kotlin.reflect.KClass
    @d5.d
    public Collection<KFunction<T>> l() {
        return this.data.n().k();
    }

    @Override // kotlin.reflect.KClass
    @d5.d
    public List<KType> m() {
        return this.data.n().w();
    }

    @Override // kotlin.reflect.KClass
    public boolean t() {
        return n().r() == kotlin.reflect.jvm.internal.impl.descriptors.e0.SEALED;
    }

    @d5.d
    public String toString() {
        String str;
        String h22;
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("訪"));
        kotlin.reflect.jvm.internal.impl.name.b u02 = u0();
        kotlin.reflect.jvm.internal.impl.name.c h5 = u02.h();
        kotlin.jvm.internal.l0.o(h5, ProtectedSandApp.s("訫"));
        if (h5.d()) {
            str = "";
        } else {
            str = h5.b() + org.apache.commons.io.k.f32026a;
        }
        String b6 = u02.i().b();
        kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("訬"));
        h22 = kotlin.text.e0.h2(b6, org.apache.commons.io.k.f32026a, Typography.f27127c, false, 4, null);
        sb.append(str + h22);
        return sb.toString();
    }

    @Override // kotlin.reflect.KClass
    public boolean u() {
        return n().u();
    }

    @d5.d
    public final g0.b<m<T>.a> v0() {
        return this.data;
    }

    @Override // kotlin.reflect.KClass
    @d5.d
    public List<KClass<? extends T>> w() {
        return this.data.n().u();
    }

    @Override // kotlin.reflect.jvm.internal.n
    @d5.d
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.e n() {
        return this.data.n().o();
    }

    @Override // kotlin.reflect.KClass
    public boolean x() {
        return n().x();
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h x0() {
        return n().E().C();
    }

    @Override // kotlin.reflect.KClass
    public boolean y() {
        return n().y();
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h y0() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h Z = n().Z();
        kotlin.jvm.internal.l0.o(Z, ProtectedSandApp.s("設"));
        return Z;
    }
}
