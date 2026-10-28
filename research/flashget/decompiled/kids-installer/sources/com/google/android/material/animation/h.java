package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Property;
import androidx.annotation.i1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MotionSpec.java */
/* loaded from: classes2.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private static final String f12791c = ProtectedSandApp.s("ሀ");

    /* renamed from: a, reason: collision with root package name */
    private final androidx.collection.i<String, i> f12792a = new androidx.collection.i<>();

    /* renamed from: b, reason: collision with root package name */
    private final androidx.collection.i<String, PropertyValuesHolder[]> f12793b = new androidx.collection.i<>();

    private static void a(@o0 h hVar, Animator animator) {
        if (!(animator instanceof ObjectAnimator)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᇼ") + animator);
        }
        ObjectAnimator objectAnimator = (ObjectAnimator) animator;
        hVar.l(objectAnimator.getPropertyName(), objectAnimator.getValues());
        hVar.m(objectAnimator.getPropertyName(), i.b(objectAnimator));
    }

    @o0
    private PropertyValuesHolder[] b(@o0 PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i5 = 0; i5 < propertyValuesHolderArr.length; i5++) {
            propertyValuesHolderArr2[i5] = propertyValuesHolderArr[i5].clone();
        }
        return propertyValuesHolderArr2;
    }

    @q0
    public static h c(@o0 Context context, @o0 TypedArray typedArray, @i1 int i5) {
        int resourceId;
        if (!typedArray.hasValue(i5) || (resourceId = typedArray.getResourceId(i5, 0)) == 0) {
            return null;
        }
        return d(context, resourceId);
    }

    @q0
    public static h d(@o0 Context context, @androidx.annotation.b int i5) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i5);
            if (loadAnimator instanceof AnimatorSet) {
                return e(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return e(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i5);
            return null;
        }
    }

    @o0
    private static h e(@o0 List<Animator> list) {
        h hVar = new h();
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            a(hVar, list.get(i5));
        }
        return hVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.f12792a.equals(((h) obj).f12792a);
        }
        return false;
    }

    @o0
    public <T> ObjectAnimator f(@o0 String str, @o0 T t5, @o0 Property<T, ?> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t5, g(str));
        ofPropertyValuesHolder.setProperty(property);
        h(str).a(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    @o0
    public PropertyValuesHolder[] g(String str) {
        if (j(str)) {
            return b(this.f12793b.get(str));
        }
        throw new IllegalArgumentException();
    }

    public i h(String str) {
        if (k(str)) {
            return this.f12792a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public int hashCode() {
        return this.f12792a.hashCode();
    }

    public long i() {
        int size = this.f12792a.size();
        long j5 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i q5 = this.f12792a.q(i5);
            j5 = Math.max(j5, q5.d() + q5.c());
        }
        return j5;
    }

    public boolean j(String str) {
        return this.f12793b.get(str) != null;
    }

    public boolean k(String str) {
        return this.f12792a.get(str) != null;
    }

    public void l(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f12793b.put(str, propertyValuesHolderArr);
    }

    public void m(String str, @q0 i iVar) {
        this.f12792a.put(str, iVar);
    }

    @o0
    public String toString() {
        return ProtectedSandApp.s("ᇽ") + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + ProtectedSandApp.s("ᇾ") + this.f12792a + ProtectedSandApp.s("ᇿ");
    }
}
