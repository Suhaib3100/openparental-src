package kotlin.reflect;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.c1;

/* compiled from: KClass.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001e\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0001H¦\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R$\u0010\u001b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160\u00158&X¦\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R&\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0\u00158&X¦\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001d\u0010\u0018R$\u0010\"\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u00158&X¦\u0004¢\u0006\f\u0012\u0004\b!\u0010\u001a\u001a\u0004\b \u0010\u0018R\u001c\u0010&\u001a\u0004\u0018\u00018\u00008&X¦\u0004¢\u0006\f\u0012\u0004\b%\u0010\u001a\u001a\u0004\b#\u0010$R \u0010,\u001a\b\u0012\u0004\u0012\u00020(0'8&X§\u0004¢\u0006\f\u0012\u0004\b+\u0010\u001a\u001a\u0004\b)\u0010*R \u00100\u001a\b\u0012\u0004\u0012\u00020-0'8&X§\u0004¢\u0006\f\u0012\u0004\b/\u0010\u001a\u001a\u0004\b.\u0010*R(\u00103\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00000'8&X§\u0004¢\u0006\f\u0012\u0004\b2\u0010\u001a\u001a\u0004\b1\u0010*R\u001c\u00108\u001a\u0004\u0018\u0001048&X§\u0004¢\u0006\f\u0012\u0004\b7\u0010\u001a\u001a\u0004\b5\u00106R\u001a\u00109\u001a\u00020\u00078&X§\u0004¢\u0006\f\u0012\u0004\b;\u0010\u001a\u001a\u0004\b9\u0010:R\u001a\u0010<\u001a\u00020\u00078&X§\u0004¢\u0006\f\u0012\u0004\b=\u0010\u001a\u001a\u0004\b<\u0010:R\u001a\u0010>\u001a\u00020\u00078&X§\u0004¢\u0006\f\u0012\u0004\b?\u0010\u001a\u001a\u0004\b>\u0010:R\u001a\u0010B\u001a\u00020\u00078&X§\u0004¢\u0006\f\u0012\u0004\bA\u0010\u001a\u001a\u0004\b@\u0010:R\u001a\u0010E\u001a\u00020\u00078&X§\u0004¢\u0006\f\u0012\u0004\bD\u0010\u001a\u001a\u0004\bC\u0010:R\u001a\u0010H\u001a\u00020\u00078&X§\u0004¢\u0006\f\u0012\u0004\bG\u0010\u001a\u001a\u0004\bF\u0010:R\u001a\u0010K\u001a\u00020\u00078&X§\u0004¢\u0006\f\u0012\u0004\bJ\u0010\u001a\u001a\u0004\bI\u0010:R\u001a\u0010N\u001a\u00020\u00078&X§\u0004¢\u0006\f\u0012\u0004\bM\u0010\u001a\u001a\u0004\bL\u0010:R\u001a\u0010Q\u001a\u00020\u00078&X§\u0004¢\u0006\f\u0012\u0004\bP\u0010\u001a\u001a\u0004\bO\u0010:¨\u0006R"}, d2 = {"Lkotlin/reflect/d;", "", "T", "Lkotlin/reflect/h;", "Lkotlin/reflect/b;", "Lkotlin/reflect/g;", "value", "", "q", "(Ljava/lang/Object;)Z", "other", "equals", "", "hashCode", "()I", "", "W", "()Ljava/lang/String;", "simpleName", "N", "qualifiedName", "", "Lkotlin/reflect/c;", "r", "()Ljava/util/Collection;", "getMembers$annotations", "()V", "members", "Lkotlin/reflect/i;", "h", "getConstructors$annotations", "constructors", "D", "getNestedClasses$annotations", "nestedClasses", "E", "()Ljava/lang/Object;", "getObjectInstance$annotations", "objectInstance", "", "Lkotlin/reflect/t;", "getTypeParameters", "()Ljava/util/List;", "getTypeParameters$annotations", "typeParameters", "Lkotlin/reflect/s;", "j", "getSupertypes$annotations", "supertypes", "m", "getSealedSubclasses$annotations", "sealedSubclasses", "Lkotlin/reflect/w;", "getVisibility", "()Lkotlin/reflect/w;", "getVisibility$annotations", "visibility", "isFinal", "()Z", "isFinal$annotations", "isOpen", "isOpen$annotations", "isAbstract", "isAbstract$annotations", "p", "isSealed$annotations", "isSealed", "C", "isData$annotations", "isData", "n", "isInner$annotations", "isInner", "F", "isCompanion$annotations", "isCompanion", "v", "isFun$annotations", "isFun", "w", "isValue$annotations", "isValue", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface d<T> extends h, b, g {

    /* compiled from: KClass.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a() {
        }

        public static /* synthetic */ void b() {
        }

        public static /* synthetic */ void c() {
        }

        public static /* synthetic */ void d() {
        }

        @c1(version = "1.3")
        public static /* synthetic */ void e() {
        }

        @c1(version = "1.1")
        public static /* synthetic */ void f() {
        }

        @c1(version = "1.1")
        public static /* synthetic */ void g() {
        }

        @c1(version = "1.1")
        public static /* synthetic */ void h() {
        }

        @c1(version = "1.1")
        public static /* synthetic */ void i() {
        }

        @c1(version = "1.1")
        public static /* synthetic */ void j() {
        }

        @c1(version = "1.1")
        public static /* synthetic */ void k() {
        }

        @c1(version = "1.1")
        public static /* synthetic */ void l() {
        }

        @c1(version = "1.4")
        public static /* synthetic */ void m() {
        }

        @c1(version = "1.1")
        public static /* synthetic */ void n() {
        }

        @c1(version = "1.1")
        public static /* synthetic */ void o() {
        }

        @c1(version = "1.1")
        public static /* synthetic */ void p() {
        }

        @c1(version = "1.5")
        public static /* synthetic */ void q() {
        }
    }

    boolean C();

    @fg.l
    Collection<d<?>> D();

    @fg.m
    T E();

    boolean F();

    @fg.m
    String N();

    @fg.m
    String W();

    boolean equals(@fg.m Object other);

    @fg.l
    List<t> getTypeParameters();

    @fg.m
    w getVisibility();

    @fg.l
    Collection<i<T>> h();

    int hashCode();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    @fg.l
    List<s> j();

    @fg.l
    List<d<? extends T>> m();

    boolean n();

    boolean p();

    @c1(version = "1.1")
    boolean q(@fg.m Object value);

    @Override // kotlin.reflect.h
    @fg.l
    Collection<c<?>> r();

    boolean v();

    boolean w();
}
