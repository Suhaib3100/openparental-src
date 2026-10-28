package com.google.android.libraries.places.widget.internal.ui;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.interpolator.view.animation.b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.internal.zzev;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzo extends j {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();
    private final int zzd;

    public zzo(Resources resources) {
        this.zzd = resources.getDimensionPixelSize(R.dimen.places_autocomplete_vertical_dropdown);
    }

    private final void zzd(RecyclerView.e0 e0Var) {
        View view = e0Var.itemView;
        this.zzc.add(e0Var);
        long moveDuration = getMoveDuration();
        int layoutPosition = e0Var.getLayoutPosition();
        view.setTranslationY(-this.zzd);
        view.setAlpha(0.0f);
        ViewPropertyAnimator animate = view.animate();
        animate.cancel();
        animate.translationY(0.0f).alpha(1.0f).setDuration(133L).setInterpolator(new b()).setStartDelay(moveDuration + (layoutPosition * 67));
        animate.setListener(new zzn(this, view, e0Var, animate)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzf(View view) {
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.j, androidx.recyclerview.widget.d0
    public final boolean animateAdd(RecyclerView.e0 e0Var) {
        try {
            endAnimation(e0Var);
            e0Var.itemView.setAlpha(0.0f);
            if (((zzs) e0Var).zzb()) {
                this.zza.add(e0Var);
                return true;
            }
            this.zzb.add(e0Var);
            return true;
        } catch (Error e4) {
            e = e4;
            zzev.zzb(e);
            throw e;
        } catch (RuntimeException e5) {
            e = e5;
            zzev.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.j, androidx.recyclerview.widget.RecyclerView.m
    public final void endAnimation(RecyclerView.e0 e0Var) {
        try {
            super.endAnimation(e0Var);
            if (this.zza.remove(e0Var)) {
                zzf(e0Var.itemView);
                dispatchAddFinished(e0Var);
            }
            zze();
        } catch (Error e4) {
            e = e4;
            zzev.zzb(e);
            throw e;
        } catch (RuntimeException e5) {
            e = e5;
            zzev.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.j, androidx.recyclerview.widget.RecyclerView.m
    public final void endAnimations() {
        try {
            int size = this.zza.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                RecyclerView.e0 e0Var = (RecyclerView.e0) this.zza.get(size);
                zzf(e0Var.itemView);
                dispatchAddFinished(e0Var);
                this.zza.remove(size);
            }
            List list = this.zzc;
            int size2 = list.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    super.endAnimations();
                    return;
                }
                ((RecyclerView.e0) list.get(size2)).itemView.animate().cancel();
            }
        } catch (Error e4) {
            e = e4;
            zzev.zzb(e);
            throw e;
        } catch (RuntimeException e5) {
            e = e5;
            zzev.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.j, androidx.recyclerview.widget.RecyclerView.m
    public final boolean isRunning() {
        try {
            if (!super.isRunning() && this.zzb.isEmpty() && this.zza.isEmpty()) {
                return !this.zzc.isEmpty();
            }
            return true;
        } catch (Error | RuntimeException e4) {
            zzev.zzb(e4);
            throw e4;
        }
    }

    @Override // androidx.recyclerview.widget.j, androidx.recyclerview.widget.RecyclerView.m
    public final void runPendingAnimations() {
        try {
            Iterator it = this.zzb.iterator();
            while (it.hasNext()) {
                super.animateAdd((RecyclerView.e0) it.next());
            }
            this.zzb.clear();
            super.runPendingAnimations();
            if (this.zza.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.zza);
            this.zza.clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                RecyclerView.e0 e0Var = (RecyclerView.e0) it2.next();
                View view = e0Var.itemView;
                this.zzc.add(e0Var);
                long moveDuration = getMoveDuration() + (e0Var.getLayoutPosition() * 67);
                view.setTranslationY(-this.zzd);
                view.setAlpha(0.0f);
                ViewPropertyAnimator animate = view.animate();
                animate.cancel();
                animate.translationY(0.0f).alpha(1.0f).setDuration(133L).setInterpolator(new b()).setStartDelay(moveDuration);
                animate.setListener(new zzn(this, view, e0Var, animate)).start();
            }
        } catch (Error e4) {
            e = e4;
            zzev.zzb(e);
            throw e;
        } catch (RuntimeException e5) {
            e = e5;
            zzev.zzb(e);
            throw e;
        }
    }
}
