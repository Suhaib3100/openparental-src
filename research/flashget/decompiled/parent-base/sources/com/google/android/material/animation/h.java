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
import androidx.collection.a3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MotionSpec.java */
/* loaded from: classes6.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private static final String f52479c = ProtectedSandApp.s("\uf143");

    /* renamed from: a, reason: collision with root package name */
    private final a3<String, i> f52480a = new a3<>();

    /* renamed from: b, reason: collision with root package name */
    private final a3<String, PropertyValuesHolder[]> f52481b = new a3<>();

    private static void a(@o0 h hVar, Animator animator) {
        if (!(animator instanceof ObjectAnimator)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf13f") + animator);
        }
        ObjectAnimator objectAnimator = (ObjectAnimator) animator;
        hVar.l(objectAnimator.getPropertyName(), objectAnimator.getValues());
        hVar.m(objectAnimator.getPropertyName(), i.b(objectAnimator));
    }

    @o0
    private PropertyValuesHolder[] b(@o0 PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i4 = 0; i4 < propertyValuesHolderArr.length; i4++) {
            propertyValuesHolderArr2[i4] = propertyValuesHolderArr[i4].clone();
        }
        return propertyValuesHolderArr2;
    }

    @q0
    public static h c(@o0 Context context, @o0 TypedArray typedArray, @i1 int i4) {
        int resourceId;
        if (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0) {
            return null;
        }
        return d(context, resourceId);
    }

    @q0
    public static h d(@o0 Context context, @androidx.annotation.b int i4) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i4);
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
            Integer.toHexString(i4);
            return null;
        }
    }

    @o0
    private static h e(@o0 List<Animator> list) {
        h hVar = new h();
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            a(hVar, list.get(i4));
        }
        return hVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.f52480a.equals(((h) obj).f52480a);
        }
        return false;
    }

    @o0
    public <T> ObjectAnimator f(@o0 String str, @o0 T t4, @o0 Property<T, ?> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t4, g(str));
        ofPropertyValuesHolder.setProperty(property);
        h(str).a(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    @o0
    public PropertyValuesHolder[] g(String str) {
        if (j(str)) {
            return b(this.f52481b.get(str));
        }
        throw new IllegalArgumentException();
    }

    public i h(String str) {
        if (k(str)) {
            return this.f52480a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public int hashCode() {
        return this.f52480a.hashCode();
    }

    public long i() {
        int size = this.f52480a.getSize();
        long j4 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i valueAt = this.f52480a.valueAt(i4);
            j4 = Math.max(j4, valueAt.d() + valueAt.c());
        }
        return j4;
    }

    public boolean j(String str) {
        return this.f52481b.get(str) != null;
    }

    public boolean k(String str) {
        return this.f52480a.get(str) != null;
    }

    public void l(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f52481b.put(str, propertyValuesHolderArr);
    }

    public void m(String str, @q0 i iVar) {
        this.f52480a.put(str, iVar);
    }

    @o0
    public String toString() {
        return ProtectedSandApp.s("\uf140") + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + ProtectedSandApp.s("\uf141") + this.f52480a + ProtectedSandApp.s("\uf142");
    }
}
