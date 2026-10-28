package kotlin.reflect;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.c1;

/* compiled from: KCallable.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J'\u0010\u0006\u001a\u00028\u00002\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\u00028\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH&¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8&X§\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00128&X¦\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00178&X¦\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00128&X§\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001d\u0010\u0014R\u001c\u0010$\u001a\u0004\u0018\u00010 8&X§\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0010\u001a\u0004\b!\u0010\"R\u001a\u0010&\u001a\u00020%8&X§\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0010\u001a\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020%8&X§\u0004¢\u0006\f\u0012\u0004\b*\u0010\u0010\u001a\u0004\b)\u0010'R\u001a\u0010+\u001a\u00020%8&X§\u0004¢\u0006\f\u0012\u0004\b,\u0010\u0010\u001a\u0004\b+\u0010'R\u001a\u0010-\u001a\u00020%8&X§\u0004¢\u0006\f\u0012\u0004\b.\u0010\u0010\u001a\u0004\b-\u0010'¨\u0006/"}, d2 = {"Lkotlin/reflect/c;", "R", "Lkotlin/reflect/b;", "", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "", "Lkotlin/reflect/n;", "callBy", "(Ljava/util/Map;)Ljava/lang/Object;", "", "getName", "()Ljava/lang/String;", "getName$annotations", "()V", "name", "", "getParameters", "()Ljava/util/List;", "getParameters$annotations", "parameters", "Lkotlin/reflect/s;", "getReturnType", "()Lkotlin/reflect/s;", "getReturnType$annotations", "returnType", "Lkotlin/reflect/t;", "getTypeParameters", "getTypeParameters$annotations", "typeParameters", "Lkotlin/reflect/w;", "getVisibility", "()Lkotlin/reflect/w;", "getVisibility$annotations", "visibility", "", "isFinal", "()Z", "isFinal$annotations", "isOpen", "isOpen$annotations", "isAbstract", "isAbstract$annotations", "isSuspend", "isSuspend$annotations", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface c<R> extends b {

    /* compiled from: KCallable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        @kotlin.internal.g
        public static /* synthetic */ void a() {
        }

        public static /* synthetic */ void b() {
        }

        public static /* synthetic */ void c() {
        }

        @c1(version = "1.1")
        public static /* synthetic */ void d() {
        }

        @c1(version = "1.1")
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

        @c1(version = "1.3")
        public static /* synthetic */ void i() {
        }
    }

    R call(@fg.l Object... args);

    R callBy(@fg.l Map<n, ? extends Object> args);

    @fg.l
    String getName();

    @fg.l
    List<n> getParameters();

    @fg.l
    s getReturnType();

    @fg.l
    List<t> getTypeParameters();

    @fg.m
    w getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
