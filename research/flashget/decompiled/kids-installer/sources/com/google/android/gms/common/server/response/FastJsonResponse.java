package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Log;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.data.a;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public abstract class FastJsonResponse {

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @ShowFirstParty
    public interface FieldConverter<I, O> {
        int zaa();

        int zab();

        @q0
        O zac(@o0 I i5);

        @o0
        I zad(@o0 O o5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0
    protected static final <O, I> I zaD(@o0 Field<I, O> field, @q0 Object obj) {
        return ((Field) field).zak != null ? field.zaf(obj) : obj;
    }

    private final <I, O> void zaE(Field<I, O> field, @q0 I i5) {
        String str = field.zae;
        O zae = field.zae(i5);
        int i6 = field.zac;
        switch (i6) {
            case 0:
                if (zae != null) {
                    setIntegerInternal(field, str, ((Integer) zae).intValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 1:
                zaf(field, str, (BigInteger) zae);
                return;
            case 2:
                if (zae != null) {
                    setLongInternal(field, str, ((Long) zae).longValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 3:
            default:
                throw new IllegalStateException(a.a(44, ProtectedSandApp.s("ௗ"), i6));
            case 4:
                if (zae != null) {
                    zan(field, str, ((Double) zae).doubleValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 5:
                zab(field, str, (BigDecimal) zae);
                return;
            case 6:
                if (zae != null) {
                    setBooleanInternal(field, str, ((Boolean) zae).booleanValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 7:
                setStringInternal(field, str, (String) zae);
                return;
            case 8:
            case 9:
                if (zae != null) {
                    setDecodedBytesInternal(field, str, (byte[]) zae);
                    return;
                } else {
                    zaG(str);
                    return;
                }
        }
    }

    private static final void zaF(StringBuilder sb, Field field, Object obj) {
        int i5 = field.zaa;
        if (i5 == 11) {
            Class<? extends FastJsonResponse> cls = field.zag;
            Preconditions.checkNotNull(cls);
            sb.append(cls.cast(obj).toString());
        } else {
            if (i5 != 7) {
                sb.append(obj);
                return;
            }
            String s5 = ProtectedSandApp.s("\u0bd8");
            sb.append(s5);
            sb.append(JsonUtils.escapeString((String) obj));
            sb.append(s5);
        }
    }

    private static final <O> void zaG(String str) {
        if (Log.isLoggable(ProtectedSandApp.s("\u0bd9"), 6)) {
            new StringBuilder(String.valueOf(str).length() + 58);
        }
    }

    @KeepForSdk
    public <T extends FastJsonResponse> void addConcreteTypeArrayInternal(@o0 Field field, @o0 String str, @q0 ArrayList<T> arrayList) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("\u0bda"));
    }

    @KeepForSdk
    public <T extends FastJsonResponse> void addConcreteTypeInternal(@o0 Field field, @o0 String str, @o0 T t5) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("\u0bdb"));
    }

    @o0
    @KeepForSdk
    public abstract Map<String, Field<?, ?>> getFieldMappings();

    @q0
    @KeepForSdk
    protected Object getFieldValue(@o0 Field field) {
        String str = field.zae;
        if (field.zag == null) {
            return getValueObject(str);
        }
        Preconditions.checkState(getValueObject(str) == null, ProtectedSandApp.s("\u0bdc"), field.zae);
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
            sb.append(ProtectedSandApp.s("\u0bdd"));
            sb.append(upperCase);
            sb.append(substring);
            return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e6) {
            throw new RuntimeException(e6);
        }
    }

    @q0
    @KeepForSdk
    protected abstract Object getValueObject(@o0 String str);

    @KeepForSdk
    protected boolean isFieldSet(@o0 Field field) {
        if (field.zac != 11) {
            return isPrimitiveFieldSet(field.zae);
        }
        if (field.zad) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\u0bde"));
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("\u0bdf"));
    }

    @KeepForSdk
    protected abstract boolean isPrimitiveFieldSet(@o0 String str);

    @KeepForSdk
    protected void setBooleanInternal(@o0 Field<?, ?> field, @o0 String str, boolean z5) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("\u0be0"));
    }

    @KeepForSdk
    protected void setDecodedBytesInternal(@o0 Field<?, ?> field, @o0 String str, @q0 byte[] bArr) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("\u0be1"));
    }

    @KeepForSdk
    protected void setIntegerInternal(@o0 Field<?, ?> field, @o0 String str, int i5) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("\u0be2"));
    }

    @KeepForSdk
    protected void setLongInternal(@o0 Field<?, ?> field, @o0 String str, long j5) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("\u0be3"));
    }

    @KeepForSdk
    protected void setStringInternal(@o0 Field<?, ?> field, @o0 String str, @q0 String str2) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("\u0be4"));
    }

    @KeepForSdk
    protected void setStringMapInternal(@o0 Field<?, ?> field, @o0 String str, @q0 Map<String, String> map) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("\u0be5"));
    }

    @KeepForSdk
    protected void setStringsInternal(@o0 Field<?, ?> field, @o0 String str, @q0 ArrayList<String> arrayList) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("௦"));
    }

    @o0
    @KeepForSdk
    public String toString() {
        Map<String, Field<?, ?>> fieldMappings = getFieldMappings();
        StringBuilder sb = new StringBuilder(100);
        for (String str : fieldMappings.keySet()) {
            Field<?, ?> field = fieldMappings.get(str);
            if (isFieldSet(field)) {
                Object zaD = zaD(field, getFieldValue(field));
                int length = sb.length();
                String s5 = ProtectedSandApp.s("௧");
                if (length == 0) {
                    sb.append(ProtectedSandApp.s("௨"));
                } else {
                    sb.append(s5);
                }
                String s6 = ProtectedSandApp.s("௩");
                sb.append(s6);
                sb.append(str);
                sb.append(ProtectedSandApp.s("௪"));
                if (zaD != null) {
                    switch (field.zac) {
                        case 8:
                            sb.append(s6);
                            sb.append(Base64Utils.encode((byte[]) zaD));
                            sb.append(s6);
                            break;
                        case 9:
                            sb.append(s6);
                            sb.append(Base64Utils.encodeUrlSafe((byte[]) zaD));
                            sb.append(s6);
                            break;
                        case 10:
                            MapUtils.writeStringMapToJson(sb, (HashMap) zaD);
                            break;
                        default:
                            if (field.zab) {
                                ArrayList arrayList = (ArrayList) zaD;
                                sb.append(ProtectedSandApp.s("௬"));
                                int size = arrayList.size();
                                for (int i5 = 0; i5 < size; i5++) {
                                    if (i5 > 0) {
                                        sb.append(s5);
                                    }
                                    Object obj = arrayList.get(i5);
                                    if (obj != null) {
                                        zaF(sb, field, obj);
                                    }
                                }
                                sb.append(ProtectedSandApp.s("௭"));
                                break;
                            } else {
                                zaF(sb, field, zaD);
                                break;
                            }
                    }
                } else {
                    sb.append(ProtectedSandApp.s("௫"));
                }
            }
        }
        if (sb.length() > 0) {
            sb.append(ProtectedSandApp.s("௮"));
        } else {
            sb.append(ProtectedSandApp.s("௯"));
        }
        return sb.toString();
    }

    public final <O> void zaA(@o0 Field<String, O> field, @q0 String str) {
        if (((Field) field).zak != null) {
            zaE(field, str);
        } else {
            setStringInternal(field, field.zae, str);
        }
    }

    public final <O> void zaB(@o0 Field<Map<String, String>, O> field, @q0 Map<String, String> map) {
        if (((Field) field).zak != null) {
            zaE(field, map);
        } else {
            setStringMapInternal(field, field.zae, map);
        }
    }

    public final <O> void zaC(@o0 Field<ArrayList<String>, O> field, @q0 ArrayList<String> arrayList) {
        if (((Field) field).zak != null) {
            zaE(field, arrayList);
        } else {
            setStringsInternal(field, field.zae, arrayList);
        }
    }

    public final <O> void zaa(@o0 Field<BigDecimal, O> field, @q0 BigDecimal bigDecimal) {
        if (((Field) field).zak != null) {
            zaE(field, bigDecimal);
        } else {
            zab(field, field.zae, bigDecimal);
        }
    }

    protected void zab(@o0 Field<?, ?> field, @o0 String str, @q0 BigDecimal bigDecimal) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("௰"));
    }

    public final <O> void zac(@o0 Field<ArrayList<BigDecimal>, O> field, @q0 ArrayList<BigDecimal> arrayList) {
        if (((Field) field).zak != null) {
            zaE(field, arrayList);
        } else {
            zad(field, field.zae, arrayList);
        }
    }

    protected void zad(@o0 Field<?, ?> field, @o0 String str, @q0 ArrayList<BigDecimal> arrayList) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("௱"));
    }

    public final <O> void zae(@o0 Field<BigInteger, O> field, @q0 BigInteger bigInteger) {
        if (((Field) field).zak != null) {
            zaE(field, bigInteger);
        } else {
            zaf(field, field.zae, bigInteger);
        }
    }

    protected void zaf(@o0 Field<?, ?> field, @o0 String str, @q0 BigInteger bigInteger) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("௲"));
    }

    public final <O> void zag(@o0 Field<ArrayList<BigInteger>, O> field, @q0 ArrayList<BigInteger> arrayList) {
        if (((Field) field).zak != null) {
            zaE(field, arrayList);
        } else {
            zah(field, field.zae, arrayList);
        }
    }

    protected void zah(@o0 Field<?, ?> field, @o0 String str, @q0 ArrayList<BigInteger> arrayList) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("௳"));
    }

    public final <O> void zai(@o0 Field<Boolean, O> field, boolean z5) {
        if (((Field) field).zak != null) {
            zaE(field, Boolean.valueOf(z5));
        } else {
            setBooleanInternal(field, field.zae, z5);
        }
    }

    public final <O> void zaj(@o0 Field<ArrayList<Boolean>, O> field, @q0 ArrayList<Boolean> arrayList) {
        if (((Field) field).zak != null) {
            zaE(field, arrayList);
        } else {
            zak(field, field.zae, arrayList);
        }
    }

    protected void zak(@o0 Field<?, ?> field, @o0 String str, @q0 ArrayList<Boolean> arrayList) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("௴"));
    }

    public final <O> void zal(@o0 Field<byte[], O> field, @q0 byte[] bArr) {
        if (((Field) field).zak != null) {
            zaE(field, bArr);
        } else {
            setDecodedBytesInternal(field, field.zae, bArr);
        }
    }

    public final <O> void zam(@o0 Field<Double, O> field, double d6) {
        if (((Field) field).zak != null) {
            zaE(field, Double.valueOf(d6));
        } else {
            zan(field, field.zae, d6);
        }
    }

    protected void zan(@o0 Field<?, ?> field, @o0 String str, double d6) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("௵"));
    }

    public final <O> void zao(@o0 Field<ArrayList<Double>, O> field, @q0 ArrayList<Double> arrayList) {
        if (((Field) field).zak != null) {
            zaE(field, arrayList);
        } else {
            zap(field, field.zae, arrayList);
        }
    }

    protected void zap(@o0 Field<?, ?> field, @o0 String str, @q0 ArrayList<Double> arrayList) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("௶"));
    }

    public final <O> void zaq(@o0 Field<Float, O> field, float f6) {
        if (((Field) field).zak != null) {
            zaE(field, Float.valueOf(f6));
        } else {
            zar(field, field.zae, f6);
        }
    }

    protected void zar(@o0 Field<?, ?> field, @o0 String str, float f6) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("௷"));
    }

    public final <O> void zas(@o0 Field<ArrayList<Float>, O> field, @q0 ArrayList<Float> arrayList) {
        if (((Field) field).zak != null) {
            zaE(field, arrayList);
        } else {
            zat(field, field.zae, arrayList);
        }
    }

    protected void zat(@o0 Field<?, ?> field, @o0 String str, @q0 ArrayList<Float> arrayList) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("௸"));
    }

    public final <O> void zau(@o0 Field<Integer, O> field, int i5) {
        if (((Field) field).zak != null) {
            zaE(field, Integer.valueOf(i5));
        } else {
            setIntegerInternal(field, field.zae, i5);
        }
    }

    public final <O> void zav(@o0 Field<ArrayList<Integer>, O> field, @q0 ArrayList<Integer> arrayList) {
        if (((Field) field).zak != null) {
            zaE(field, arrayList);
        } else {
            zaw(field, field.zae, arrayList);
        }
    }

    protected void zaw(@o0 Field<?, ?> field, @o0 String str, @q0 ArrayList<Integer> arrayList) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("௹"));
    }

    public final <O> void zax(@o0 Field<Long, O> field, long j5) {
        if (((Field) field).zak != null) {
            zaE(field, Long.valueOf(j5));
        } else {
            setLongInternal(field, field.zae, j5);
        }
    }

    public final <O> void zay(@o0 Field<ArrayList<Long>, O> field, @q0 ArrayList<Long> arrayList) {
        if (((Field) field).zak != null) {
            zaE(field, arrayList);
        } else {
            zaz(field, field.zae, arrayList);
        }
    }

    protected void zaz(@o0 Field<?, ?> field, @o0 String str, @q0 ArrayList<Long> arrayList) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("௺"));
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @VisibleForTesting
    @SafeParcelable.Class(creator = "FieldCreator")
    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes3.dex */
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zaj CREATOR = new zaj();

        @SafeParcelable.Field(getter = "getTypeIn", id = 2)
        protected final int zaa;

        @SafeParcelable.Field(getter = "isTypeInArray", id = 3)
        protected final boolean zab;

        @SafeParcelable.Field(getter = "getTypeOut", id = 4)
        protected final int zac;

        @SafeParcelable.Field(getter = "isTypeOutArray", id = 5)
        protected final boolean zad;

        @o0
        @SafeParcelable.Field(getter = "getOutputFieldName", id = 6)
        protected final String zae;

        @SafeParcelable.Field(getter = "getSafeParcelableFieldId", id = 7)
        protected final int zaf;

        @q0
        protected final Class<? extends FastJsonResponse> zag;

        @q0
        @SafeParcelable.Field(getter = "getConcreteTypeName", id = 8)
        protected final String zah;

        @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
        private final int zai;
        private zan zaj;

        @q0
        @SafeParcelable.Field(getter = "getWrappedConverter", id = 9, type = "com.google.android.gms.common.server.converter.ConverterWrapper")
        private FieldConverter<I, O> zak;

        @SafeParcelable.Constructor
        Field(@SafeParcelable.Param(id = 1) int i5, @SafeParcelable.Param(id = 2) int i6, @SafeParcelable.Param(id = 3) boolean z5, @SafeParcelable.Param(id = 4) int i7, @SafeParcelable.Param(id = 5) boolean z6, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) int i8, @q0 @SafeParcelable.Param(id = 8) String str2, @q0 @SafeParcelable.Param(id = 9) com.google.android.gms.common.server.converter.zaa zaaVar) {
            this.zai = i5;
            this.zaa = i6;
            this.zab = z5;
            this.zac = i7;
            this.zad = z6;
            this.zae = str;
            this.zaf = i8;
            if (str2 == null) {
                this.zag = null;
                this.zah = null;
            } else {
                this.zag = SafeParcelResponse.class;
                this.zah = str2;
            }
            if (zaaVar == null) {
                this.zak = null;
            } else {
                this.zak = (FieldConverter<I, O>) zaaVar.zab();
            }
        }

        @VisibleForTesting
        @o0
        @KeepForSdk
        public static Field<byte[], byte[]> forBase64(@o0 String str, int i5) {
            return new Field<>(8, false, 8, false, str, i5, null, null);
        }

        @o0
        @KeepForSdk
        public static Field<Boolean, Boolean> forBoolean(@o0 String str, int i5) {
            return new Field<>(6, false, 6, false, str, i5, null, null);
        }

        @o0
        @KeepForSdk
        public static <T extends FastJsonResponse> Field<T, T> forConcreteType(@o0 String str, int i5, @o0 Class<T> cls) {
            return new Field<>(11, false, 11, false, str, i5, cls, null);
        }

        @o0
        @KeepForSdk
        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> forConcreteTypeArray(@o0 String str, int i5, @o0 Class<T> cls) {
            return new Field<>(11, true, 11, true, str, i5, cls, null);
        }

        @o0
        @KeepForSdk
        public static Field<Double, Double> forDouble(@o0 String str, int i5) {
            return new Field<>(4, false, 4, false, str, i5, null, null);
        }

        @o0
        @KeepForSdk
        public static Field<Float, Float> forFloat(@o0 String str, int i5) {
            return new Field<>(3, false, 3, false, str, i5, null, null);
        }

        @VisibleForTesting
        @o0
        @KeepForSdk
        public static Field<Integer, Integer> forInteger(@o0 String str, int i5) {
            return new Field<>(0, false, 0, false, str, i5, null, null);
        }

        @o0
        @KeepForSdk
        public static Field<Long, Long> forLong(@o0 String str, int i5) {
            return new Field<>(2, false, 2, false, str, i5, null, null);
        }

        @o0
        @KeepForSdk
        public static Field<String, String> forString(@o0 String str, int i5) {
            return new Field<>(7, false, 7, false, str, i5, null, null);
        }

        @o0
        @KeepForSdk
        public static Field<HashMap<String, String>, HashMap<String, String>> forStringMap(@o0 String str, int i5) {
            return new Field<>(10, false, 10, false, str, i5, null, null);
        }

        @o0
        @KeepForSdk
        public static Field<ArrayList<String>, ArrayList<String>> forStrings(@o0 String str, int i5) {
            return new Field<>(7, true, 7, true, str, i5, null, null);
        }

        @o0
        @KeepForSdk
        public static Field withConverter(@o0 String str, int i5, @o0 FieldConverter<?, ?> fieldConverter, boolean z5) {
            fieldConverter.zaa();
            fieldConverter.zab();
            return new Field(7, z5, 0, false, str, i5, null, fieldConverter);
        }

        @KeepForSdk
        public int getSafeParcelableFieldId() {
            return this.zaf;
        }

        @o0
        public final String toString() {
            Objects.ToStringHelper add = Objects.toStringHelper(this).add(ProtectedSandApp.s("≴"), Integer.valueOf(this.zai)).add(ProtectedSandApp.s("≵"), Integer.valueOf(this.zaa)).add(ProtectedSandApp.s("≶"), Boolean.valueOf(this.zab)).add(ProtectedSandApp.s("≷"), Integer.valueOf(this.zac)).add(ProtectedSandApp.s("≸"), Boolean.valueOf(this.zad)).add(ProtectedSandApp.s("≹"), this.zae).add(ProtectedSandApp.s("≺"), Integer.valueOf(this.zaf)).add(ProtectedSandApp.s("≻"), zag());
            Class<? extends FastJsonResponse> cls = this.zag;
            if (cls != null) {
                add.add(ProtectedSandApp.s("≼"), cls.getCanonicalName());
            }
            FieldConverter<I, O> fieldConverter = this.zak;
            if (fieldConverter != null) {
                add.add(ProtectedSandApp.s("≽"), fieldConverter.getClass().getCanonicalName());
            }
            return add.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@o0 Parcel parcel, int i5) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 1, this.zai);
            SafeParcelWriter.writeInt(parcel, 2, this.zaa);
            SafeParcelWriter.writeBoolean(parcel, 3, this.zab);
            SafeParcelWriter.writeInt(parcel, 4, this.zac);
            SafeParcelWriter.writeBoolean(parcel, 5, this.zad);
            SafeParcelWriter.writeString(parcel, 6, this.zae, false);
            SafeParcelWriter.writeInt(parcel, 7, getSafeParcelableFieldId());
            SafeParcelWriter.writeString(parcel, 8, zag(), false);
            SafeParcelWriter.writeParcelable(parcel, 9, zaa(), i5, false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        @q0
        final com.google.android.gms.common.server.converter.zaa zaa() {
            FieldConverter<I, O> fieldConverter = this.zak;
            if (fieldConverter == null) {
                return null;
            }
            return com.google.android.gms.common.server.converter.zaa.zaa(fieldConverter);
        }

        @o0
        public final Field<I, O> zab() {
            return new Field<>(this.zai, this.zaa, this.zab, this.zac, this.zad, this.zae, this.zaf, this.zah, zaa());
        }

        @o0
        public final FastJsonResponse zad() throws InstantiationException, IllegalAccessException {
            Preconditions.checkNotNull(this.zag);
            Class<? extends FastJsonResponse> cls = this.zag;
            if (cls != SafeParcelResponse.class) {
                return cls.newInstance();
            }
            Preconditions.checkNotNull(this.zah);
            Preconditions.checkNotNull(this.zaj, ProtectedSandApp.s("≾"));
            return new SafeParcelResponse(this.zaj, this.zah);
        }

        @o0
        public final O zae(@q0 I i5) {
            Preconditions.checkNotNull(this.zak);
            return (O) Preconditions.checkNotNull(this.zak.zac(i5));
        }

        @o0
        public final I zaf(@o0 O o5) {
            Preconditions.checkNotNull(this.zak);
            return this.zak.zad(o5);
        }

        @q0
        final String zag() {
            String str = this.zah;
            if (str == null) {
                return null;
            }
            return str;
        }

        @o0
        public final Map<String, Field<?, ?>> zah() {
            Preconditions.checkNotNull(this.zah);
            Preconditions.checkNotNull(this.zaj);
            return (Map) Preconditions.checkNotNull(this.zaj.zab(this.zah));
        }

        public final void zai(zan zanVar) {
            this.zaj = zanVar;
        }

        public final boolean zaj() {
            return this.zak != null;
        }

        protected Field(int i5, boolean z5, int i6, boolean z6, @o0 String str, int i7, @q0 Class<? extends FastJsonResponse> cls, @q0 FieldConverter<I, O> fieldConverter) {
            this.zai = 1;
            this.zaa = i5;
            this.zab = z5;
            this.zac = i6;
            this.zad = z6;
            this.zae = str;
            this.zaf = i7;
            this.zag = cls;
            if (cls == null) {
                this.zah = null;
            } else {
                this.zah = cls.getCanonicalName();
            }
            this.zak = fieldConverter;
        }
    }
}
