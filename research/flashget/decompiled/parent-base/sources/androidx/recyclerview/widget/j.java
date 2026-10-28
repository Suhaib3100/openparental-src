package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.o0;
import androidx.core.view.x1;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes3.dex */
public class j extends d0 {
    private static final boolean DEBUG = false;
    private static TimeInterpolator sDefaultInterpolator;
    private ArrayList<RecyclerView.e0> mPendingRemovals = new ArrayList<>();
    private ArrayList<RecyclerView.e0> mPendingAdditions = new ArrayList<>();
    private ArrayList<C0596j> mPendingMoves = new ArrayList<>();
    private ArrayList<i> mPendingChanges = new ArrayList<>();
    ArrayList<ArrayList<RecyclerView.e0>> mAdditionsList = new ArrayList<>();
    ArrayList<ArrayList<C0596j>> mMovesList = new ArrayList<>();
    ArrayList<ArrayList<i>> mChangesList = new ArrayList<>();
    ArrayList<RecyclerView.e0> mAddAnimations = new ArrayList<>();
    ArrayList<RecyclerView.e0> mMoveAnimations = new ArrayList<>();
    ArrayList<RecyclerView.e0> mRemoveAnimations = new ArrayList<>();
    ArrayList<RecyclerView.e0> mChangeAnimations = new ArrayList<>();

    /* compiled from: DefaultItemAnimator.java */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f33186b;

        a(ArrayList arrayList) {
            this.f33186b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f33186b.iterator();
            while (it.hasNext()) {
                C0596j c0596j = (C0596j) it.next();
                j.this.animateMoveImpl(c0596j.f33220a, c0596j.f33221b, c0596j.f33222c, c0596j.f33223d, c0596j.f33224e);
            }
            this.f33186b.clear();
            j.this.mMovesList.remove(this.f33186b);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f33188b;

        b(ArrayList arrayList) {
            this.f33188b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f33188b.iterator();
            while (it.hasNext()) {
                j.this.animateChangeImpl((i) it.next());
            }
            this.f33188b.clear();
            j.this.mChangesList.remove(this.f33188b);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f33190b;

        c(ArrayList arrayList) {
            this.f33190b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f33190b.iterator();
            while (it.hasNext()) {
                j.this.animateAddImpl((RecyclerView.e0) it.next());
            }
            this.f33190b.clear();
            j.this.mAdditionsList.remove(this.f33190b);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    class d extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecyclerView.e0 f33192b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f33193c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f33194d;

        d(RecyclerView.e0 e0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f33192b = e0Var;
            this.f33193c = viewPropertyAnimator;
            this.f33194d = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f33193c.setListener(null);
            this.f33194d.setAlpha(1.0f);
            j.this.dispatchRemoveFinished(this.f33192b);
            j.this.mRemoveAnimations.remove(this.f33192b);
            j.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j.this.dispatchRemoveStarting(this.f33192b);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    class e extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecyclerView.e0 f33196b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f33197c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f33198d;

        e(RecyclerView.e0 e0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f33196b = e0Var;
            this.f33197c = view;
            this.f33198d = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f33197c.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f33198d.setListener(null);
            j.this.dispatchAddFinished(this.f33196b);
            j.this.mAddAnimations.remove(this.f33196b);
            j.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j.this.dispatchAddStarting(this.f33196b);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    class f extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecyclerView.e0 f33200b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f33201c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f33202d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f33203e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f33204f;

        f(RecyclerView.e0 e0Var, int i4, View view, int i5, ViewPropertyAnimator viewPropertyAnimator) {
            this.f33200b = e0Var;
            this.f33201c = i4;
            this.f33202d = view;
            this.f33203e = i5;
            this.f33204f = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f33201c != 0) {
                this.f33202d.setTranslationX(0.0f);
            }
            if (this.f33203e != 0) {
                this.f33202d.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f33204f.setListener(null);
            j.this.dispatchMoveFinished(this.f33200b);
            j.this.mMoveAnimations.remove(this.f33200b);
            j.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j.this.dispatchMoveStarting(this.f33200b);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    class g extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f33206b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f33207c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f33208d;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f33206b = iVar;
            this.f33207c = viewPropertyAnimator;
            this.f33208d = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f33207c.setListener(null);
            this.f33208d.setAlpha(1.0f);
            this.f33208d.setTranslationX(0.0f);
            this.f33208d.setTranslationY(0.0f);
            j.this.dispatchChangeFinished(this.f33206b.f33214a, true);
            j.this.mChangeAnimations.remove(this.f33206b.f33214a);
            j.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j.this.dispatchChangeStarting(this.f33206b.f33214a, true);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    class h extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f33210b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f33211c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f33212d;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f33210b = iVar;
            this.f33211c = viewPropertyAnimator;
            this.f33212d = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f33211c.setListener(null);
            this.f33212d.setAlpha(1.0f);
            this.f33212d.setTranslationX(0.0f);
            this.f33212d.setTranslationY(0.0f);
            j.this.dispatchChangeFinished(this.f33210b.f33215b, false);
            j.this.mChangeAnimations.remove(this.f33210b.f33215b);
            j.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j.this.dispatchChangeStarting(this.f33210b.f33215b, false);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.j$j, reason: collision with other inner class name */
    private static class C0596j {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.e0 f33220a;

        /* renamed from: b, reason: collision with root package name */
        public int f33221b;

        /* renamed from: c, reason: collision with root package name */
        public int f33222c;

        /* renamed from: d, reason: collision with root package name */
        public int f33223d;

        /* renamed from: e, reason: collision with root package name */
        public int f33224e;

        C0596j(RecyclerView.e0 e0Var, int i4, int i5, int i6, int i7) {
            this.f33220a = e0Var;
            this.f33221b = i4;
            this.f33222c = i5;
            this.f33223d = i6;
            this.f33224e = i7;
        }
    }

    private void animateRemoveImpl(RecyclerView.e0 e0Var) {
        View view = e0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.mRemoveAnimations.add(e0Var);
        animate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new d(e0Var, animate, view)).start();
    }

    private void endChangeAnimation(List<i> list, RecyclerView.e0 e0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (endChangeAnimationIfNecessary(iVar, e0Var) && iVar.f33214a == null && iVar.f33215b == null) {
                list.remove(iVar);
            }
        }
    }

    private void endChangeAnimationIfNecessary(i iVar) {
        RecyclerView.e0 e0Var = iVar.f33214a;
        if (e0Var != null) {
            endChangeAnimationIfNecessary(iVar, e0Var);
        }
        RecyclerView.e0 e0Var2 = iVar.f33215b;
        if (e0Var2 != null) {
            endChangeAnimationIfNecessary(iVar, e0Var2);
        }
    }

    private void resetAnimation(RecyclerView.e0 e0Var) {
        if (sDefaultInterpolator == null) {
            sDefaultInterpolator = new ValueAnimator().getInterpolator();
        }
        e0Var.itemView.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(e0Var);
    }

    @Override // androidx.recyclerview.widget.d0
    @SuppressLint({"UnknownNullness"})
    public boolean animateAdd(RecyclerView.e0 e0Var) {
        resetAnimation(e0Var);
        e0Var.itemView.setAlpha(0.0f);
        this.mPendingAdditions.add(e0Var);
        return true;
    }

    void animateAddImpl(RecyclerView.e0 e0Var) {
        View view = e0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.mAddAnimations.add(e0Var);
        animate.alpha(1.0f).setDuration(getAddDuration()).setListener(new e(e0Var, view, animate)).start();
    }

    @Override // androidx.recyclerview.widget.d0
    @SuppressLint({"UnknownNullness"})
    public boolean animateChange(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i4, int i5, int i6, int i7) {
        if (e0Var == e0Var2) {
            return animateMove(e0Var, i4, i5, i6, i7);
        }
        float translationX = e0Var.itemView.getTranslationX();
        float translationY = e0Var.itemView.getTranslationY();
        float alpha = e0Var.itemView.getAlpha();
        resetAnimation(e0Var);
        int i10 = (int) ((i6 - i4) - translationX);
        int i11 = (int) ((i7 - i5) - translationY);
        e0Var.itemView.setTranslationX(translationX);
        e0Var.itemView.setTranslationY(translationY);
        e0Var.itemView.setAlpha(alpha);
        if (e0Var2 != null) {
            resetAnimation(e0Var2);
            e0Var2.itemView.setTranslationX(-i10);
            e0Var2.itemView.setTranslationY(-i11);
            e0Var2.itemView.setAlpha(0.0f);
        }
        this.mPendingChanges.add(new i(e0Var, e0Var2, i4, i5, i6, i7));
        return true;
    }

    void animateChangeImpl(i iVar) {
        RecyclerView.e0 e0Var = iVar.f33214a;
        View view = e0Var == null ? null : e0Var.itemView;
        RecyclerView.e0 e0Var2 = iVar.f33215b;
        View view2 = e0Var2 != null ? e0Var2.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(iVar.f33214a);
            duration.translationX(iVar.f33218e - iVar.f33216c);
            duration.translationY(iVar.f33219f - iVar.f33217d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.mChangeAnimations.add(iVar.f33215b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    @Override // androidx.recyclerview.widget.d0
    @SuppressLint({"UnknownNullness"})
    public boolean animateMove(RecyclerView.e0 e0Var, int i4, int i5, int i6, int i7) {
        View view = e0Var.itemView;
        int translationX = i4 + ((int) view.getTranslationX());
        int translationY = i5 + ((int) e0Var.itemView.getTranslationY());
        resetAnimation(e0Var);
        int i10 = i6 - translationX;
        int i11 = i7 - translationY;
        if (i10 == 0 && i11 == 0) {
            dispatchMoveFinished(e0Var);
            return false;
        }
        if (i10 != 0) {
            view.setTranslationX(-i10);
        }
        if (i11 != 0) {
            view.setTranslationY(-i11);
        }
        this.mPendingMoves.add(new C0596j(e0Var, translationX, translationY, i6, i7));
        return true;
    }

    void animateMoveImpl(RecyclerView.e0 e0Var, int i4, int i5, int i6, int i7) {
        View view = e0Var.itemView;
        int i10 = i6 - i4;
        int i11 = i7 - i5;
        if (i10 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i11 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.mMoveAnimations.add(e0Var);
        animate.setDuration(getMoveDuration()).setListener(new f(e0Var, i10, view, i11, animate)).start();
    }

    @Override // androidx.recyclerview.widget.d0
    @SuppressLint({"UnknownNullness"})
    public boolean animateRemove(RecyclerView.e0 e0Var) {
        resetAnimation(e0Var);
        this.mPendingRemovals.add(e0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean canReuseUpdatedViewHolder(@o0 RecyclerView.e0 e0Var, @o0 List<Object> list) {
        return !list.isEmpty() || super.canReuseUpdatedViewHolder(e0Var, list);
    }

    void cancelAll(List<RecyclerView.e0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    void dispatchFinishedWhenDone() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public void endAnimation(RecyclerView.e0 e0Var) {
        View view = e0Var.itemView;
        view.animate().cancel();
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.mPendingMoves.get(size).f33220a == e0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(e0Var);
                this.mPendingMoves.remove(size);
            }
        }
        endChangeAnimation(this.mPendingChanges, e0Var);
        if (this.mPendingRemovals.remove(e0Var)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(e0Var);
        }
        if (this.mPendingAdditions.remove(e0Var)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(e0Var);
        }
        for (int size2 = this.mChangesList.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.mChangesList.get(size2);
            endChangeAnimation(arrayList, e0Var);
            if (arrayList.isEmpty()) {
                this.mChangesList.remove(size2);
            }
        }
        for (int size3 = this.mMovesList.size() - 1; size3 >= 0; size3--) {
            ArrayList<C0596j> arrayList2 = this.mMovesList.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f33220a == e0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(e0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.mMovesList.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.mAdditionsList.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.e0> arrayList3 = this.mAdditionsList.get(size5);
            if (arrayList3.remove(e0Var)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(e0Var);
                if (arrayList3.isEmpty()) {
                    this.mAdditionsList.remove(size5);
                }
            }
        }
        this.mRemoveAnimations.remove(e0Var);
        this.mAddAnimations.remove(e0Var);
        this.mChangeAnimations.remove(e0Var);
        this.mMoveAnimations.remove(e0Var);
        dispatchFinishedWhenDone();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void endAnimations() {
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0596j c0596j = this.mPendingMoves.get(size);
            View view = c0596j.f33220a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(c0596j.f33220a);
            this.mPendingMoves.remove(size);
        }
        for (int size2 = this.mPendingRemovals.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.mPendingRemovals.get(size2));
            this.mPendingRemovals.remove(size2);
        }
        int size3 = this.mPendingAdditions.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.e0 e0Var = this.mPendingAdditions.get(size3);
            e0Var.itemView.setAlpha(1.0f);
            dispatchAddFinished(e0Var);
            this.mPendingAdditions.remove(size3);
        }
        for (int size4 = this.mPendingChanges.size() - 1; size4 >= 0; size4--) {
            endChangeAnimationIfNecessary(this.mPendingChanges.get(size4));
        }
        this.mPendingChanges.clear();
        if (isRunning()) {
            for (int size5 = this.mMovesList.size() - 1; size5 >= 0; size5--) {
                ArrayList<C0596j> arrayList = this.mMovesList.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C0596j c0596j2 = arrayList.get(size6);
                    View view2 = c0596j2.f33220a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(c0596j2.f33220a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.mMovesList.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.mAdditionsList.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.e0> arrayList2 = this.mAdditionsList.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.e0 e0Var2 = arrayList2.get(size8);
                    e0Var2.itemView.setAlpha(1.0f);
                    dispatchAddFinished(e0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.mAdditionsList.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.mChangesList.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.mChangesList.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    endChangeAnimationIfNecessary(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.mChangesList.remove(arrayList3);
                    }
                }
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean isRunning() {
        return (this.mPendingAdditions.isEmpty() && this.mPendingChanges.isEmpty() && this.mPendingMoves.isEmpty() && this.mPendingRemovals.isEmpty() && this.mMoveAnimations.isEmpty() && this.mRemoveAnimations.isEmpty() && this.mAddAnimations.isEmpty() && this.mChangeAnimations.isEmpty() && this.mMovesList.isEmpty() && this.mAdditionsList.isEmpty() && this.mChangesList.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void runPendingAnimations() {
        boolean isEmpty = this.mPendingRemovals.isEmpty();
        boolean isEmpty2 = this.mPendingMoves.isEmpty();
        boolean isEmpty3 = this.mPendingChanges.isEmpty();
        boolean isEmpty4 = this.mPendingAdditions.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        Iterator<RecyclerView.e0> it = this.mPendingRemovals.iterator();
        while (it.hasNext()) {
            animateRemoveImpl(it.next());
        }
        this.mPendingRemovals.clear();
        if (!isEmpty2) {
            ArrayList<C0596j> arrayList = new ArrayList<>();
            arrayList.addAll(this.mPendingMoves);
            this.mMovesList.add(arrayList);
            this.mPendingMoves.clear();
            a aVar = new a(arrayList);
            if (isEmpty) {
                aVar.run();
            } else {
                x1.w1(arrayList.get(0).f33220a.itemView, aVar, getRemoveDuration());
            }
        }
        if (!isEmpty3) {
            ArrayList<i> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.mPendingChanges);
            this.mChangesList.add(arrayList2);
            this.mPendingChanges.clear();
            b bVar = new b(arrayList2);
            if (isEmpty) {
                bVar.run();
            } else {
                x1.w1(arrayList2.get(0).f33214a.itemView, bVar, getRemoveDuration());
            }
        }
        if (isEmpty4) {
            return;
        }
        ArrayList<RecyclerView.e0> arrayList3 = new ArrayList<>();
        arrayList3.addAll(this.mPendingAdditions);
        this.mAdditionsList.add(arrayList3);
        this.mPendingAdditions.clear();
        c cVar = new c(arrayList3);
        if (isEmpty && isEmpty2 && isEmpty3) {
            cVar.run();
        } else {
            x1.w1(arrayList3.get(0).itemView, cVar, Math.max(!isEmpty2 ? getMoveDuration() : 0L, isEmpty3 ? 0L : getChangeDuration()) + (!isEmpty ? getRemoveDuration() : 0L));
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    private static class i {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.e0 f33214a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.e0 f33215b;

        /* renamed from: c, reason: collision with root package name */
        public int f33216c;

        /* renamed from: d, reason: collision with root package name */
        public int f33217d;

        /* renamed from: e, reason: collision with root package name */
        public int f33218e;

        /* renamed from: f, reason: collision with root package name */
        public int f33219f;

        private i(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
            this.f33214a = e0Var;
            this.f33215b = e0Var2;
        }

        @SuppressLint({"UnknownNullness"})
        public String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.f33214a);
            sb.append(", newHolder=");
            sb.append(this.f33215b);
            sb.append(", fromX=");
            sb.append(this.f33216c);
            sb.append(", fromY=");
            sb.append(this.f33217d);
            sb.append(", toX=");
            sb.append(this.f33218e);
            sb.append(", toY=");
            return androidx.view.e.a(sb, this.f33219f, '}');
        }

        i(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i4, int i5, int i6, int i7) {
            this(e0Var, e0Var2);
            this.f33216c = i4;
            this.f33217d = i5;
            this.f33218e = i6;
            this.f33219f = i7;
        }
    }

    private boolean endChangeAnimationIfNecessary(i iVar, RecyclerView.e0 e0Var) {
        boolean z4 = false;
        if (iVar.f33215b == e0Var) {
            iVar.f33215b = null;
        } else {
            if (iVar.f33214a != e0Var) {
                return false;
            }
            iVar.f33214a = null;
            z4 = true;
        }
        e0Var.itemView.setAlpha(1.0f);
        e0Var.itemView.setTranslationX(0.0f);
        e0Var.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(e0Var, z4);
        return true;
    }
}
