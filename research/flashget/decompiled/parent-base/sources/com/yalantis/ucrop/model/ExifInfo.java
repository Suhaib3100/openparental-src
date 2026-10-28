package com.yalantis.ucrop.model;

/* loaded from: classes7.dex */
public class ExifInfo {
    private int mExifDegrees;
    private int mExifOrientation;
    private int mExifTranslation;

    public ExifInfo(int i4, int i5, int i6) {
        this.mExifOrientation = i4;
        this.mExifDegrees = i5;
        this.mExifTranslation = i6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExifInfo exifInfo = (ExifInfo) obj;
        return this.mExifOrientation == exifInfo.mExifOrientation && this.mExifDegrees == exifInfo.mExifDegrees && this.mExifTranslation == exifInfo.mExifTranslation;
    }

    public int getExifDegrees() {
        return this.mExifDegrees;
    }

    public int getExifOrientation() {
        return this.mExifOrientation;
    }

    public int getExifTranslation() {
        return this.mExifTranslation;
    }

    public int hashCode() {
        return (((this.mExifOrientation * 31) + this.mExifDegrees) * 31) + this.mExifTranslation;
    }

    public void setExifDegrees(int i4) {
        this.mExifDegrees = i4;
    }

    public void setExifOrientation(int i4) {
        this.mExifOrientation = i4;
    }

    public void setExifTranslation(int i4) {
        this.mExifTranslation = i4;
    }
}
