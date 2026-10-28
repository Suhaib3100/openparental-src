package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Pair;
import kotlin.Metadata;
import kotlin.q0;

/* compiled from: Pair.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a,\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0087\n¢\u0006\u0004\b\u0003\u0010\u0004\u001a,\u0010\u0005\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0087\n¢\u0006\u0004\b\u0005\u0010\u0004\u001a8\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a8\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0086\b¢\u0006\u0004\b\t\u0010\n\u001a,\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0087\n¢\u0006\u0004\b\f\u0010\r\u001a,\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0087\n¢\u0006\u0004\b\u000e\u0010\r\u001a8\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a8\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"F", "S", "Landroidx/core/util/s;", "b", "(Landroidx/core/util/s;)Ljava/lang/Object;", "d", "Lkotlin/q0;", "h", "(Landroidx/core/util/s;)Lkotlin/q0;", "f", "(Lkotlin/q0;)Landroidx/core/util/s;", "Landroid/util/Pair;", "a", "(Landroid/util/Pair;)Ljava/lang/Object;", "c", "g", "(Landroid/util/Pair;)Lkotlin/q0;", "e", "(Lkotlin/q0;)Landroid/util/Pair;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t {
    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F a(@fg.l Pair<F, S> pair) {
        return (F) pair.first;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F b(@fg.l s<F, S> sVar) {
        return sVar.f26881a;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S c(@fg.l Pair<F, S> pair) {
        return (S) pair.second;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S d(@fg.l s<F, S> sVar) {
        return sVar.f26882b;
    }

    @fg.l
    public static final <F, S> Pair<F, S> e(@fg.l q0<? extends F, ? extends S> q0Var) {
        return new Pair<>(q0Var.e(), q0Var.f());
    }

    @fg.l
    public static final <F, S> s<F, S> f(@fg.l q0<? extends F, ? extends S> q0Var) {
        return new s<>(q0Var.e(), q0Var.f());
    }

    @fg.l
    public static final <F, S> q0<F, S> g(@fg.l Pair<F, S> pair) {
        return new q0<>(pair.first, pair.second);
    }

    @fg.l
    public static final <F, S> q0<F, S> h(@fg.l s<F, S> sVar) {
        return new q0<>(sVar.f26881a, sVar.f26882b);
    }
}
