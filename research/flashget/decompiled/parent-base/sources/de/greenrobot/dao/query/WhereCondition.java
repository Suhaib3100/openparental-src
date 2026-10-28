package de.greenrobot.dao.query;

import androidx.databinding.a;
import com.flashget.parentalcontrol.ProtectedSandApp;
import de.greenrobot.dao.DaoException;
import de.greenrobot.dao.Property;
import java.util.Date;
import java.util.List;

/* loaded from: classes7.dex */
public interface WhereCondition {
    void appendTo(StringBuilder sb, String str);

    void appendValuesTo(List<Object> list);

    public static class StringCondition extends AbstractCondition {
        protected final String string;

        public StringCondition(String str) {
            this.string = str;
        }

        @Override // de.greenrobot.dao.query.WhereCondition
        public void appendTo(StringBuilder sb, String str) {
            sb.append(this.string);
        }

        public StringCondition(String str, Object obj) {
            super(obj);
            this.string = str;
        }

        public StringCondition(String str, Object... objArr) {
            super(objArr);
            this.string = str;
        }
    }

    public static class PropertyCondition extends AbstractCondition {
        public final String op;
        public final Property property;

        public PropertyCondition(Property property, String str) {
            this.property = property;
            this.op = str;
        }

        private static Object checkValueForType(Property property, Object obj) {
            if (obj != null && obj.getClass().isArray()) {
                throw new DaoException(ProtectedSandApp.s("怖\u0001"));
            }
            Class<?> cls = property.type;
            if (cls == Date.class) {
                if (obj instanceof Date) {
                    return Long.valueOf(((Date) obj).getTime());
                }
                if (obj instanceof Long) {
                    return obj;
                }
                throw new DaoException(a.a(ProtectedSandApp.s("怗\u0001"), obj));
            }
            if (cls == Boolean.TYPE || cls == Boolean.class) {
                if (obj instanceof Boolean) {
                    return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
                }
                if (obj instanceof Number) {
                    int intValue = ((Number) obj).intValue();
                    if (intValue != 0 && intValue != 1) {
                        throw new DaoException(a.a(ProtectedSandApp.s("怘\u0001"), obj));
                    }
                } else if (obj instanceof String) {
                    String str = (String) obj;
                    if (ProtectedSandApp.s("怙\u0001").equalsIgnoreCase(str)) {
                        return 1;
                    }
                    if (ProtectedSandApp.s("怚\u0001").equalsIgnoreCase(str)) {
                        return 0;
                    }
                    throw new DaoException(a.a(ProtectedSandApp.s("怛\u0001"), obj));
                }
            }
            return obj;
        }

        private static Object[] checkValuesForType(Property property, Object[] objArr) {
            for (int i4 = 0; i4 < objArr.length; i4++) {
                objArr[i4] = checkValueForType(property, objArr[i4]);
            }
            return objArr;
        }

        @Override // de.greenrobot.dao.query.WhereCondition
        public void appendTo(StringBuilder sb, String str) {
            if (str != null) {
                sb.append(str);
                sb.append('.');
            }
            sb.append('\'');
            sb.append(this.property.columnName);
            sb.append('\'');
            sb.append(this.op);
        }

        public PropertyCondition(Property property, String str, Object obj) {
            super(checkValueForType(property, obj));
            this.property = property;
            this.op = str;
        }

        public PropertyCondition(Property property, String str, Object[] objArr) {
            super(checkValuesForType(property, objArr));
            this.property = property;
            this.op = str;
        }
    }

    public static abstract class AbstractCondition implements WhereCondition {
        protected final boolean hasSingleValue;
        protected final Object value;
        protected final Object[] values;

        public AbstractCondition() {
            this.hasSingleValue = false;
            this.value = null;
            this.values = null;
        }

        @Override // de.greenrobot.dao.query.WhereCondition
        public void appendValuesTo(List<Object> list) {
            if (this.hasSingleValue) {
                list.add(this.value);
            }
            Object[] objArr = this.values;
            if (objArr != null) {
                for (Object obj : objArr) {
                    list.add(obj);
                }
            }
        }

        public AbstractCondition(Object obj) {
            this.value = obj;
            this.hasSingleValue = true;
            this.values = null;
        }

        public AbstractCondition(Object[] objArr) {
            this.value = null;
            this.hasSingleValue = false;
            this.values = objArr;
        }
    }
}
