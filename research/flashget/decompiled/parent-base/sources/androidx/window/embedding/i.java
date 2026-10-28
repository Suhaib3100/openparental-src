package androidx.window.embedding;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.util.Pair;
import android.view.WindowMetrics;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.EmbeddingRule;
import androidx.window.extensions.embedding.SplitInfo;
import androidx.window.extensions.embedding.SplitPairRule;
import androidx.window.extensions.embedding.SplitPlaceholderRule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: EmbeddingAdapter.kt */
@androidx.window.core.d
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0082\u0002¢\u0006\u0004\b\f\u0010\rJ,\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0082\u0002¢\u0006\u0004\b\u000e\u0010\rJ!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u000b0\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001a0\u000b0\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0007¢\u0006\u0004\b\u001b\u0010\u0019J\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00162\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0013H\u0007¢\u0006\u0004\b#\u0010\u0019J#\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00162\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0013H\u0007¢\u0006\u0004\b$\u0010\u0019J!\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00132\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u0013¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"Landroidx/window/embedding/i;", "", "<init>", "()V", "Landroidx/window/extensions/embedding/SplitInfo;", "splitInfo", "Landroidx/window/embedding/t;", "h", "(Landroidx/window/extensions/embedding/SplitInfo;)Landroidx/window/embedding/t;", "F", "S", "Landroid/util/Pair;", "f", "(Landroid/util/Pair;)Ljava/lang/Object;", "g", "", "splitInfoList", "i", "(Ljava/util/List;)Ljava/util/List;", "", "Landroidx/window/embedding/u;", "splitPairFilters", "Ljava/util/function/Predicate;", "Landroid/app/Activity;", "m", "(Ljava/util/Set;)Ljava/util/function/Predicate;", "Landroid/content/Intent;", "k", "Landroidx/window/embedding/x;", "splitRule", "Landroid/view/WindowMetrics;", "s", "(Landroidx/window/embedding/x;)Ljava/util/function/Predicate;", "Landroidx/window/embedding/a;", "activityFilters", "o", "q", "Landroidx/window/embedding/m;", "rules", "Landroidx/window/extensions/embedding/EmbeddingRule;", "j", "(Ljava/util/Set;)Ljava/util/Set;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i {
    private final <F, S> F f(Pair<F, S> pair) {
        l0.p(pair, "<this>");
        return (F) pair.first;
    }

    private final <F, S> S g(Pair<F, S> pair) {
        l0.p(pair, "<this>");
        return (S) pair.second;
    }

    private final t h(SplitInfo splitInfo) {
        boolean z4;
        ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        l0.o(primaryActivityStack, "splitInfo.primaryActivityStack");
        boolean z5 = false;
        try {
            z4 = primaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused) {
            z4 = false;
        }
        List activities = primaryActivityStack.getActivities();
        l0.o(activities, "primaryActivityStack.activities");
        c cVar = new c(activities, z4);
        ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        l0.o(secondaryActivityStack, "splitInfo.secondaryActivityStack");
        try {
            z5 = secondaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused2) {
        }
        List activities2 = secondaryActivityStack.getActivities();
        l0.o(activities2, "secondaryActivityStack.activities");
        return new t(cVar, new c(activities2, z5), splitInfo.getSplitRatio());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(i this$0, Set splitPairFilters, Pair pair) {
        l0.p(this$0, "this$0");
        l0.p(splitPairFilters, "$splitPairFilters");
        l0.o(pair, "(first, second)");
        Activity activity = (Activity) this$0.f(pair);
        Intent intent = (Intent) this$0.g(pair);
        Set set = splitPairFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((u) it.next()).d(activity, intent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(i this$0, Set splitPairFilters, Pair pair) {
        l0.p(this$0, "this$0");
        l0.p(splitPairFilters, "$splitPairFilters");
        l0.o(pair, "(first, second)");
        Activity activity = (Activity) this$0.f(pair);
        Activity activity2 = (Activity) this$0.g(pair);
        Set set = splitPairFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((u) it.next()).e(activity, activity2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(Set activityFilters, Activity activity) {
        l0.p(activityFilters, "$activityFilters");
        Set<a> set = activityFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (a aVar : set) {
            l0.o(activity, "activity");
            if (aVar.c(activity)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(Set activityFilters, Intent intent) {
        l0.p(activityFilters, "$activityFilters");
        Set<a> set = activityFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (a aVar : set) {
            l0.o(intent, "intent");
            if (aVar.d(intent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(x splitRule, WindowMetrics windowMetrics) {
        l0.p(splitRule, "$splitRule");
        l0.o(windowMetrics, "windowMetrics");
        return splitRule.a(windowMetrics);
    }

    @fg.l
    public final List<t> i(@fg.l List<? extends SplitInfo> splitInfoList) {
        l0.p(splitInfoList, "splitInfoList");
        List<? extends SplitInfo> list = splitInfoList;
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h((SplitInfo) it.next()));
        }
        return arrayList;
    }

    @fg.l
    public final Set<EmbeddingRule> j(@fg.l Set<? extends m> rules) {
        SplitPairRule build;
        l0.p(rules, "rules");
        Set<? extends m> set = rules;
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(set, 10));
        for (m mVar : set) {
            if (mVar instanceof v) {
                v vVar = (v) mVar;
                build = new SplitPairRule.Builder(m(vVar.g()), k(vVar.g()), s((x) mVar)).setSplitRatio(vVar.getSplitRatio()).setLayoutDirection(vVar.getLayoutDirection()).setShouldFinishPrimaryWithSecondary(vVar.getFinishPrimaryWithSecondary()).setShouldFinishSecondaryWithPrimary(vVar.getFinishSecondaryWithPrimary()).setShouldClearTop(vVar.getClearTop()).build();
                l0.o(build, "SplitPairRuleBuilder(\n  …                 .build()");
            } else if (mVar instanceof w) {
                w wVar = (w) mVar;
                build = new SplitPlaceholderRule.Builder(wVar.getPlaceholderIntent(), o(wVar.f()), q(wVar.f()), s((x) mVar)).setSplitRatio(wVar.getSplitRatio()).setLayoutDirection(wVar.getLayoutDirection()).build();
                l0.o(build, "SplitPlaceholderRuleBuil…                 .build()");
            } else {
                if (!(mVar instanceof b)) {
                    throw new IllegalArgumentException("Unsupported rule type");
                }
                b bVar = (b) mVar;
                build = new ActivityRule.Builder(o(bVar.b()), q(bVar.b())).setShouldAlwaysExpand(bVar.getAlwaysExpand()).build();
                l0.o(build, "ActivityRuleBuilder(\n   …                 .build()");
            }
            arrayList.add((EmbeddingRule) build);
        }
        return kotlin.collections.w.a6(arrayList);
    }

    @fg.l
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Pair<Activity, Intent>> k(@fg.l final Set<u> splitPairFilters) {
        l0.p(splitPairFilters, "splitPairFilters");
        return new Predicate() { // from class: androidx.window.embedding.g
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean l4;
                l4 = i.l(i.this, splitPairFilters, (Pair) obj);
                return l4;
            }
        };
    }

    @fg.l
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Pair<Activity, Activity>> m(@fg.l final Set<u> splitPairFilters) {
        l0.p(splitPairFilters, "splitPairFilters");
        return new Predicate() { // from class: androidx.window.embedding.f
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean n4;
                n4 = i.n(i.this, splitPairFilters, (Pair) obj);
                return n4;
            }
        };
    }

    @fg.l
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Activity> o(@fg.l final Set<a> activityFilters) {
        l0.p(activityFilters, "activityFilters");
        return new Predicate() { // from class: androidx.window.embedding.h
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean p4;
                p4 = i.p(activityFilters, (Activity) obj);
                return p4;
            }
        };
    }

    @fg.l
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Intent> q(@fg.l final Set<a> activityFilters) {
        l0.p(activityFilters, "activityFilters");
        return new Predicate() { // from class: androidx.window.embedding.d
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean r4;
                r4 = i.r(activityFilters, (Intent) obj);
                return r4;
            }
        };
    }

    @fg.l
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<WindowMetrics> s(@fg.l final x splitRule) {
        l0.p(splitRule, "splitRule");
        return new Predicate() { // from class: androidx.window.embedding.e
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean t4;
                t4 = i.t(x.this, (WindowMetrics) obj);
                return t4;
            }
        };
    }
}
