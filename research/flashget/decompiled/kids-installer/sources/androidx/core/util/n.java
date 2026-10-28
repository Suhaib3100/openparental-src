package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Pair;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Pair.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a,\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0087\n¢\u0006\u0004\b\u0003\u0010\u0004\u001a,\u0010\u0005\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0087\n¢\u0006\u0004\b\u0005\u0010\u0004\u001a1\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u001a1\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0086\b\u001a,\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0087\n¢\u0006\u0004\b\n\u0010\u000b\u001a,\u0010\f\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0087\n¢\u0006\u0004\b\f\u0010\u000b\u001a1\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0086\b\u001a1\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0086\b¨\u0006\u000f"}, d2 = {"F", "S", "Landroidx/core/util/m;", "b", "(Landroidx/core/util/m;)Ljava/lang/Object;", "d", "Lkotlin/q0;", "h", "f", "Landroid/util/Pair;", "a", "(Landroid/util/Pair;)Ljava/lang/Object;", "c", "g", "e", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class n {
    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F a(@d5.d Pair<F, S> pair) {
        l0.p(pair, "<this>");
        return (F) pair.first;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F b(@d5.d m<F, S> mVar) {
        l0.p(mVar, "<this>");
        return mVar.f5251a;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S c(@d5.d Pair<F, S> pair) {
        l0.p(pair, "<this>");
        return (S) pair.second;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S d(@d5.d m<F, S> mVar) {
        l0.p(mVar, "<this>");
        return mVar.f5252b;
    }

    @d5.d
    public static final <F, S> Pair<F, S> e(@d5.d kotlin.Pair<? extends F, ? extends S> pair) {
        l0.p(pair, "<this>");
        return new Pair<>(pair.e(), pair.f());
    }

    @d5.d
    public static final <F, S> m<F, S> f(@d5.d kotlin.Pair<? extends F, ? extends S> pair) {
        l0.p(pair, "<this>");
        return new m<>(pair.e(), pair.f());
    }

    @d5.d
    public static final <F, S> kotlin.Pair<F, S> g(@d5.d Pair<F, S> pair) {
        l0.p(pair, "<this>");
        return new kotlin.Pair<>(pair.first, pair.second);
    }

    @d5.d
    public static final <F, S> kotlin.Pair<F, S> h(@d5.d m<F, S> mVar) {
        l0.p(mVar, "<this>");
        return new kotlin.Pair<>(mVar.f5251a, mVar.f5252b);
    }
}
