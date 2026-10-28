package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import f.a;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ResourcesWrapper.java */
/* loaded from: classes.dex */
class j0 extends Resources {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f1890a;

    public j0(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1890a = resources;
    }

    final Drawable a(int i4) throws Resources.NotFoundException {
        return super.getDrawable(i4);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i4) throws Resources.NotFoundException {
        return this.f1890a.getAnimation(i4);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i4) throws Resources.NotFoundException {
        return this.f1890a.getBoolean(i4);
    }

    @Override // android.content.res.Resources
    public int getColor(int i4) throws Resources.NotFoundException {
        return this.f1890a.getColor(i4);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i4) throws Resources.NotFoundException {
        return this.f1890a.getColorStateList(i4);
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.f1890a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i4) throws Resources.NotFoundException {
        return this.f1890a.getDimension(i4);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i4) throws Resources.NotFoundException {
        return this.f1890a.getDimensionPixelOffset(i4);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i4) throws Resources.NotFoundException {
        return this.f1890a.getDimensionPixelSize(i4);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.f1890a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i4) throws Resources.NotFoundException {
        return this.f1890a.getDrawable(i4);
    }

    @Override // android.content.res.Resources
    @androidx.annotation.x0(15)
    public Drawable getDrawableForDensity(int i4, int i5) throws Resources.NotFoundException {
        return androidx.core.content.res.i.h(this.f1890a, i4, i5, null);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i4, int i5, int i6) {
        return this.f1890a.getFraction(i4, i5, i6);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.f1890a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i4) throws Resources.NotFoundException {
        return this.f1890a.getIntArray(i4);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i4) throws Resources.NotFoundException {
        return this.f1890a.getInteger(i4);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i4) throws Resources.NotFoundException {
        return this.f1890a.getLayout(i4);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i4) throws Resources.NotFoundException {
        return this.f1890a.getMovie(i4);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i4, int i5, Object... objArr) throws Resources.NotFoundException {
        return this.f1890a.getQuantityString(i4, i5, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i4, int i5) throws Resources.NotFoundException {
        return this.f1890a.getQuantityText(i4, i5);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i4) throws Resources.NotFoundException {
        return this.f1890a.getResourceEntryName(i4);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i4) throws Resources.NotFoundException {
        return this.f1890a.getResourceName(i4);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i4) throws Resources.NotFoundException {
        return this.f1890a.getResourcePackageName(i4);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i4) throws Resources.NotFoundException {
        return this.f1890a.getResourceTypeName(i4);
    }

    @Override // android.content.res.Resources
    public String getString(int i4) throws Resources.NotFoundException {
        return this.f1890a.getString(i4);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i4) throws Resources.NotFoundException {
        return this.f1890a.getStringArray(i4);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i4) throws Resources.NotFoundException {
        return this.f1890a.getText(i4);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i4) throws Resources.NotFoundException {
        return this.f1890a.getTextArray(i4);
    }

    @Override // android.content.res.Resources
    public void getValue(int i4, TypedValue typedValue, boolean z4) throws Resources.NotFoundException {
        this.f1890a.getValue(i4, typedValue, z4);
    }

    @Override // android.content.res.Resources
    @androidx.annotation.x0(15)
    public void getValueForDensity(int i4, int i5, TypedValue typedValue, boolean z4) throws Resources.NotFoundException {
        a.C1018a.a(this.f1890a, i4, i5, typedValue, z4);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i4) throws Resources.NotFoundException {
        return this.f1890a.getXml(i4);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f1890a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i4) throws Resources.NotFoundException {
        return this.f1890a.obtainTypedArray(i4);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i4) throws Resources.NotFoundException {
        return this.f1890a.openRawResource(i4);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i4) throws Resources.NotFoundException {
        return this.f1890a.openRawResourceFd(i4);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.f1890a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.f1890a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f1890a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    @androidx.annotation.x0(21)
    public Drawable getDrawable(int i4, Resources.Theme theme) throws Resources.NotFoundException {
        return androidx.core.content.res.i.g(this.f1890a, i4, theme);
    }

    @Override // android.content.res.Resources
    @androidx.annotation.x0(21)
    public Drawable getDrawableForDensity(int i4, int i5, Resources.Theme theme) {
        return androidx.core.content.res.i.h(this.f1890a, i4, i5, theme);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i4, int i5) throws Resources.NotFoundException {
        return this.f1890a.getQuantityString(i4, i5);
    }

    @Override // android.content.res.Resources
    public String getString(int i4, Object... objArr) throws Resources.NotFoundException {
        return this.f1890a.getString(i4, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i4, CharSequence charSequence) {
        return this.f1890a.getText(i4, charSequence);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z4) throws Resources.NotFoundException {
        this.f1890a.getValue(str, typedValue, z4);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i4, TypedValue typedValue) throws Resources.NotFoundException {
        return this.f1890a.openRawResource(i4, typedValue);
    }
}
