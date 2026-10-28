package c0;

import androidx.compose.ui.graphics.f2;
import com.android.internal.telephony.SmsConstants;
import com.android.internal.telephony.cdma.UserData;
import com.luck.picture.lib.config.PictureConfig;
import kotlin.Metadata;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: PaletteTokens.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\b¹\u0001\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001d\u0010\u0017\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u0019\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001d\u0010\u001b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001d\u0010\u001d\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001d\u0010\u001f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001d\u0010!\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001d\u0010#\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b \u0010\bR\u001d\u0010%\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b\"\u0010\bR\u001d\u0010'\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b$\u0010\bR\u001d\u0010)\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b&\u0010\bR\u001d\u0010+\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b(\u0010\bR\u001d\u0010-\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010\u0006\u001a\u0004\b*\u0010\bR\u001d\u0010/\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b,\u0010\bR\u001d\u00101\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b.\u0010\bR\u001d\u00103\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b2\u0010\u0006\u001a\u0004\b0\u0010\bR\u001d\u00105\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b2\u0010\bR\u001d\u00107\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b4\u0010\bR\u001d\u00109\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b8\u0010\u0006\u001a\u0004\b6\u0010\bR\u001d\u0010;\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b8\u0010\bR\u001d\u0010=\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b<\u0010\u0006\u001a\u0004\b:\u0010\bR\u001d\u0010?\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b>\u0010\u0006\u001a\u0004\b<\u0010\bR\u001d\u0010A\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\b>\u0010\bR\u001d\u0010C\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bB\u0010\u0006\u001a\u0004\b@\u0010\bR\u001d\u0010E\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bD\u0010\u0006\u001a\u0004\bB\u0010\bR\u001d\u0010G\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\bD\u0010\bR\u001d\u0010I\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bH\u0010\u0006\u001a\u0004\bF\u0010\bR\u001d\u0010K\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bJ\u0010\u0006\u001a\u0004\bH\u0010\bR\u001d\u0010L\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0006\u001a\u0004\bJ\u0010\bR\u001d\u0010N\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bM\u0010\u0006\u001a\u0004\b\u0006\u0010\bR\u001d\u0010P\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bO\u0010\u0006\u001a\u0004\bM\u0010\bR\u001d\u0010R\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bQ\u0010\u0006\u001a\u0004\bO\u0010\bR\u001d\u0010T\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bS\u0010\u0006\u001a\u0004\bQ\u0010\bR\u001d\u0010V\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bS\u0010\bR\u001d\u0010X\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bW\u0010\u0006\u001a\u0004\bU\u0010\bR\u001d\u0010Z\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bY\u0010\u0006\u001a\u0004\bW\u0010\bR\u001d\u0010\\\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b[\u0010\u0006\u001a\u0004\bY\u0010\bR\u001d\u0010^\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b]\u0010\u0006\u001a\u0004\b[\u0010\bR\u001d\u0010`\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b_\u0010\u0006\u001a\u0004\b]\u0010\bR\u001d\u0010b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\ba\u0010\u0006\u001a\u0004\b_\u0010\bR\u001d\u0010d\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bc\u0010\u0006\u001a\u0004\ba\u0010\bR\u001d\u0010f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\be\u0010\u0006\u001a\u0004\bc\u0010\bR\u001d\u0010h\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bg\u0010\u0006\u001a\u0004\be\u0010\bR\u001d\u0010j\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bi\u0010\u0006\u001a\u0004\bg\u0010\bR\u001d\u0010l\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bk\u0010\u0006\u001a\u0004\bi\u0010\bR\u001d\u0010n\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bm\u0010\u0006\u001a\u0004\bk\u0010\bR\u001d\u0010p\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bo\u0010\u0006\u001a\u0004\bm\u0010\bR\u001d\u0010r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bq\u0010\u0006\u001a\u0004\bo\u0010\bR\u001d\u0010t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bs\u0010\u0006\u001a\u0004\bq\u0010\bR\u001d\u0010v\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bu\u0010\u0006\u001a\u0004\bs\u0010\bR\u001d\u0010x\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bw\u0010\u0006\u001a\u0004\bu\u0010\bR\u001d\u0010z\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\by\u0010\u0006\u001a\u0004\bw\u0010\bR\u001d\u0010|\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b{\u0010\u0006\u001a\u0004\by\u0010\bR\u001d\u0010~\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b}\u0010\u0006\u001a\u0004\b{\u0010\bR\u001e\u0010\u0080\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u007f\u0010\u0006\u001a\u0004\b}\u0010\bR\u001f\u0010\u0082\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0005\b\u0081\u0001\u0010\u0006\u001a\u0004\b\u007f\u0010\bR \u0010\u0084\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\u0006\u001a\u0005\b\u0081\u0001\u0010\bR \u0010\u0086\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\u0006\u001a\u0005\b\u0083\u0001\u0010\bR \u0010\u0088\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\u0006\u001a\u0005\b\u0085\u0001\u0010\bR \u0010\u008a\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\u0006\u001a\u0005\b\u0087\u0001\u0010\bR \u0010\u008c\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\u0006\u001a\u0005\b\u0089\u0001\u0010\bR \u0010\u008e\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\u0006\u001a\u0005\b\u008b\u0001\u0010\bR \u0010\u0090\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\u0006\u001a\u0005\b\u008d\u0001\u0010\bR \u0010\u0092\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\u0006\u001a\u0005\b\u008f\u0001\u0010\bR \u0010\u0094\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\u0006\u001a\u0005\b\u0091\u0001\u0010\bR \u0010\u0096\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010\u0006\u001a\u0005\b\u0093\u0001\u0010\bR \u0010\u0098\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010\u0006\u001a\u0005\b\u0095\u0001\u0010\bR \u0010\u009a\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010\u0006\u001a\u0005\b\u0097\u0001\u0010\bR \u0010\u009c\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010\u0006\u001a\u0005\b\u0099\u0001\u0010\bR \u0010\u009e\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\u0006\u001a\u0005\b\u009b\u0001\u0010\bR \u0010 \u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010\u0006\u001a\u0005\b\u009d\u0001\u0010\bR \u0010¢\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b¡\u0001\u0010\u0006\u001a\u0005\b\u009f\u0001\u0010\bR \u0010¤\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b£\u0001\u0010\u0006\u001a\u0005\b¡\u0001\u0010\bR \u0010¦\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b¥\u0001\u0010\u0006\u001a\u0005\b£\u0001\u0010\bR \u0010¨\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b§\u0001\u0010\u0006\u001a\u0005\b¥\u0001\u0010\bR \u0010ª\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b©\u0001\u0010\u0006\u001a\u0005\b§\u0001\u0010\bR \u0010¬\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b«\u0001\u0010\u0006\u001a\u0005\b©\u0001\u0010\bR \u0010®\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u00ad\u0001\u0010\u0006\u001a\u0005\b«\u0001\u0010\bR \u0010°\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b¯\u0001\u0010\u0006\u001a\u0005\b\u00ad\u0001\u0010\bR \u0010²\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b±\u0001\u0010\u0006\u001a\u0005\b¯\u0001\u0010\bR \u0010´\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b³\u0001\u0010\u0006\u001a\u0005\b±\u0001\u0010\bR \u0010¶\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\bµ\u0001\u0010\u0006\u001a\u0005\b³\u0001\u0010\bR \u0010¸\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b·\u0001\u0010\u0006\u001a\u0005\bµ\u0001\u0010\bR \u0010º\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b¹\u0001\u0010\u0006\u001a\u0005\b·\u0001\u0010\bR \u0010¼\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b»\u0001\u0010\u0006\u001a\u0005\b¹\u0001\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006½\u0001"}, d2 = {"Lc0/r0;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/d2;", "b", "J", "a", "()J", "Black", "c", "Error0", "d", "Error10", "e", "Error100", "f", "Error20", "g", "Error30", "h", "Error40", "i", "Error50", "j", "Error60", "k", "Error70", "l", "Error80", "m", "Error90", "n", "Error95", "o", "Error99", "p", "Neutral0", "q", "Neutral10", "r", "Neutral100", "s", "Neutral12", "t", "Neutral17", "u", "Neutral20", "v", "Neutral22", "w", "Neutral24", "x", "Neutral30", "y", "Neutral4", "z", "Neutral40", "A", "Neutral50", "B", "Neutral6", "C", "Neutral60", "D", "Neutral70", "E", "Neutral80", "F", "Neutral87", "G", "Neutral90", "H", "Neutral92", "I", "Neutral94", "Neutral95", "K", "Neutral96", "L", "Neutral98", "M", "Neutral99", "N", "NeutralVariant0", "O", "NeutralVariant10", "P", "NeutralVariant100", "Q", "NeutralVariant20", "R", "NeutralVariant30", "S", "NeutralVariant40", "T", "NeutralVariant50", "U", "NeutralVariant60", "V", "NeutralVariant70", "W", "NeutralVariant80", "X", "NeutralVariant90", "Y", "NeutralVariant95", "Z", "NeutralVariant99", "a0", "Primary0", "b0", "Primary10", "c0", "Primary100", "d0", "Primary20", "e0", "Primary30", "f0", "Primary40", "g0", "Primary50", "h0", "Primary60", "i0", "Primary70", "j0", "Primary80", "k0", "Primary90", "l0", "Primary95", "m0", "Primary99", "n0", "Secondary0", "o0", "Secondary10", "p0", "Secondary100", "q0", "Secondary20", "r0", "Secondary30", "s0", "Secondary40", "t0", "Secondary50", "u0", "Secondary60", "v0", "Secondary70", "w0", "Secondary80", "x0", "Secondary90", "y0", "Secondary95", "z0", "Secondary99", "A0", "Tertiary0", "B0", "Tertiary10", "C0", "Tertiary100", "D0", "Tertiary20", "E0", "Tertiary30", "F0", "Tertiary40", "G0", "Tertiary50", "H0", "Tertiary60", "I0", "Tertiary70", "J0", "Tertiary80", "K0", "Tertiary90", "L0", "Tertiary95", "M0", "Tertiary99", "N0", "White", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r0 {
    public static final int O0 = 0;

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final r0 f38033a = new r0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final long Black = f2.f(0, 0, 0, 0, 8, null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final long Error0 = f2.f(0, 0, 0, 0, 8, null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final long Error10 = f2.f(65, 14, 11, 0, 8, null);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final long Error100 = f2.f(255, 255, 255, 0, 8, null);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final long Error20 = f2.f(96, 20, 16, 0, 8, null);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final long Error30 = f2.f(SmsConstants.MAX_USER_DATA_BYTES, 29, 24, 0, 8, null);

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final long Error40 = f2.f(179, 38, 30, 0, 8, null);

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final long Error50 = f2.f(220, 54, 46, 0, 8, null);

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final long Error60 = f2.f(228, 105, 98, 0, 8, null);

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final long Error70 = f2.f(236, 146, 142, 0, 8, null);

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final long Error80 = f2.f(242, SyslogAppender.LOG_LOCAL7, 181, 0, 8, null);

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final long Error90 = f2.f(249, 222, 220, 0, 8, null);

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final long Error95 = f2.f(252, 238, 238, 0, 8, null);

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final long Error99 = f2.f(255, 251, 249, 0, 8, null);

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral0 = f2.f(0, 0, 0, 0, 8, null);

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral10 = f2.f(28, 27, 31, 0, 8, null);

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral100 = f2.f(255, 255, 255, 0, 8, null);

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral12 = f2.f(32, 31, 35, 0, 8, null);

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral17 = f2.f(43, 41, 45, 0, 8, null);

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral20 = f2.f(49, 48, 51, 0, 8, null);

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral22 = f2.f(49, 48, 51, 0, 8, null);

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral24 = f2.f(49, 48, 51, 0, 8, null);

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral30 = f2.f(72, 70, 73, 0, 8, null);

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral4 = f2.f(14, 14, 17, 0, 8, null);

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final long Neutral40 = f2.f(96, 93, 98, 0, 8, null);

    /* renamed from: A, reason: from kotlin metadata */
    private static final long Neutral50 = f2.f(120, 117, 121, 0, 8, null);

    /* renamed from: B, reason: from kotlin metadata */
    private static final long Neutral6 = f2.f(20, 19, 23, 0, 8, null);

    /* renamed from: C, reason: from kotlin metadata */
    private static final long Neutral60 = f2.f(147, 144, 148, 0, 8, null);

    /* renamed from: D, reason: from kotlin metadata */
    private static final long Neutral70 = f2.f(174, 170, 174, 0, 8, null);

    /* renamed from: E, reason: from kotlin metadata */
    private static final long Neutral80 = f2.f(201, 197, 202, 0, 8, null);

    /* renamed from: F, reason: from kotlin metadata */
    private static final long Neutral87 = f2.f(221, 216, 221, 0, 8, null);

    /* renamed from: G, reason: from kotlin metadata */
    private static final long Neutral90 = f2.f(230, 225, 229, 0, 8, null);

    /* renamed from: H, reason: from kotlin metadata */
    private static final long Neutral92 = f2.f(236, 231, 236, 0, 8, null);

    /* renamed from: I, reason: from kotlin metadata */
    private static final long Neutral94 = f2.f(241, 236, 241, 0, 8, null);

    /* renamed from: J, reason: from kotlin metadata */
    private static final long Neutral95 = f2.f(244, 239, 244, 0, 8, null);

    /* renamed from: K, reason: from kotlin metadata */
    private static final long Neutral96 = f2.f(247, 242, 247, 0, 8, null);

    /* renamed from: L, reason: from kotlin metadata */
    private static final long Neutral98 = f2.f(253, 248, 253, 0, 8, null);

    /* renamed from: M, reason: from kotlin metadata */
    private static final long Neutral99 = f2.f(255, 251, 254, 0, 8, null);

    /* renamed from: N, reason: from kotlin metadata */
    private static final long NeutralVariant0 = f2.f(0, 0, 0, 0, 8, null);

    /* renamed from: O, reason: from kotlin metadata */
    private static final long NeutralVariant10 = f2.f(29, 26, 34, 0, 8, null);

    /* renamed from: P, reason: from kotlin metadata */
    private static final long NeutralVariant100 = f2.f(255, 255, 255, 0, 8, null);

    /* renamed from: Q, reason: from kotlin metadata */
    private static final long NeutralVariant20 = f2.f(50, 47, 55, 0, 8, null);

    /* renamed from: R, reason: from kotlin metadata */
    private static final long NeutralVariant30 = f2.f(73, 69, 79, 0, 8, null);

    /* renamed from: S, reason: from kotlin metadata */
    private static final long NeutralVariant40 = f2.f(96, 93, 102, 0, 8, null);

    /* renamed from: T, reason: from kotlin metadata */
    private static final long NeutralVariant50 = f2.f(121, 116, 126, 0, 8, null);

    /* renamed from: U, reason: from kotlin metadata */
    private static final long NeutralVariant60 = f2.f(147, 143, SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER, 0, 8, null);

    /* renamed from: V, reason: from kotlin metadata */
    private static final long NeutralVariant70 = f2.f(174, 169, 180, 0, 8, null);

    /* renamed from: W, reason: from kotlin metadata */
    private static final long NeutralVariant80 = f2.f(202, 196, 208, 0, 8, null);

    /* renamed from: X, reason: from kotlin metadata */
    private static final long NeutralVariant90 = f2.f(231, 224, 236, 0, 8, null);

    /* renamed from: Y, reason: from kotlin metadata */
    private static final long NeutralVariant95 = f2.f(245, 238, 250, 0, 8, null);

    /* renamed from: Z, reason: from kotlin metadata */
    private static final long NeutralVariant99 = f2.f(255, 251, 254, 0, 8, null);

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private static final long Primary0 = f2.f(0, 0, 0, 0, 8, null);

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private static final long Primary10 = f2.f(33, 0, 93, 0, 8, null);

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private static final long Primary100 = f2.f(255, 255, 255, 0, 8, null);

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private static final long Primary20 = f2.f(56, 30, 114, 0, 8, null);

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private static final long Primary30 = f2.f(79, 55, 139, 0, 8, null);

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata */
    private static final long Primary40 = f2.f(103, 80, 164, 0, 8, null);

    /* renamed from: g0, reason: collision with root package name and from kotlin metadata */
    private static final long Primary50 = f2.f(127, 103, 190, 0, 8, null);

    /* renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private static final long Primary60 = f2.f(154, UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS, 219, 0, 8, null);

    /* renamed from: i0, reason: collision with root package name and from kotlin metadata */
    private static final long Primary70 = f2.f(182, 157, 248, 0, 8, null);

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata */
    private static final long Primary80 = f2.f(208, PictureConfig.CHOOSE_REQUEST, 255, 0, 8, null);

    /* renamed from: k0, reason: collision with root package name and from kotlin metadata */
    private static final long Primary90 = f2.f(234, 221, 255, 0, 8, null);

    /* renamed from: l0, reason: collision with root package name and from kotlin metadata */
    private static final long Primary95 = f2.f(246, 237, 255, 0, 8, null);

    /* renamed from: m0, reason: collision with root package name and from kotlin metadata */
    private static final long Primary99 = f2.f(255, 251, 254, 0, 8, null);

    /* renamed from: n0, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary0 = f2.f(0, 0, 0, 0, 8, null);

    /* renamed from: o0, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary10 = f2.f(29, 25, 43, 0, 8, null);

    /* renamed from: p0, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary100 = f2.f(255, 255, 255, 0, 8, null);

    /* renamed from: q0, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary20 = f2.f(51, 45, 65, 0, 8, null);

    /* renamed from: r0, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary30 = f2.f(74, 68, 88, 0, 8, null);

    /* renamed from: s0, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary40 = f2.f(98, 91, 113, 0, 8, null);

    /* renamed from: t0, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary50 = f2.f(122, 114, 137, 0, 8, null);

    /* renamed from: u0, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary60 = f2.f(149, 141, 165, 0, 8, null);

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary70 = f2.f(SyslogAppender.LOG_LOCAL6, 167, 192, 0, 8, null);

    /* renamed from: w0, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary80 = f2.f(204, 194, 220, 0, 8, null);

    /* renamed from: x0, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary90 = f2.f(232, 222, 248, 0, 8, null);

    /* renamed from: y0, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary95 = f2.f(246, 237, 255, 0, 8, null);

    /* renamed from: z0, reason: collision with root package name and from kotlin metadata */
    private static final long Secondary99 = f2.f(255, 251, 254, 0, 8, null);

    /* renamed from: A0, reason: from kotlin metadata */
    private static final long Tertiary0 = f2.f(0, 0, 0, 0, 8, null);

    /* renamed from: B0, reason: from kotlin metadata */
    private static final long Tertiary10 = f2.f(49, 17, 29, 0, 8, null);

    /* renamed from: C0, reason: from kotlin metadata */
    private static final long Tertiary100 = f2.f(255, 255, 255, 0, 8, null);

    /* renamed from: D0, reason: from kotlin metadata */
    private static final long Tertiary20 = f2.f(73, 37, 50, 0, 8, null);

    /* renamed from: E0, reason: from kotlin metadata */
    private static final long Tertiary30 = f2.f(99, 59, 72, 0, 8, null);

    /* renamed from: F0, reason: from kotlin metadata */
    private static final long Tertiary40 = f2.f(125, 82, 96, 0, 8, null);

    /* renamed from: G0, reason: from kotlin metadata */
    private static final long Tertiary50 = f2.f(SyslogAppender.LOG_LOCAL3, 105, 119, 0, 8, null);

    /* renamed from: H0, reason: from kotlin metadata */
    private static final long Tertiary60 = f2.f(181, UserData.IS91_MSG_TYPE_SHORT_MESSAGE_FULL, 146, 0, 8, null);

    /* renamed from: I0, reason: from kotlin metadata */
    private static final long Tertiary70 = f2.f(210, 157, 172, 0, 8, null);

    /* renamed from: J0, reason: from kotlin metadata */
    private static final long Tertiary80 = f2.f(239, SyslogAppender.LOG_LOCAL7, 200, 0, 8, null);

    /* renamed from: K0, reason: from kotlin metadata */
    private static final long Tertiary90 = f2.f(255, 216, 228, 0, 8, null);

    /* renamed from: L0, reason: from kotlin metadata */
    private static final long Tertiary95 = f2.f(255, 236, 241, 0, 8, null);

    /* renamed from: M0, reason: from kotlin metadata */
    private static final long Tertiary99 = f2.f(255, 251, 250, 0, 8, null);

    /* renamed from: N0, reason: from kotlin metadata */
    private static final long White = f2.f(255, 255, 255, 0, 8, null);

    private r0() {
    }

    public final long A() {
        return Neutral6;
    }

    public final long A0() {
        return Tertiary10;
    }

    public final long B() {
        return Neutral60;
    }

    public final long B0() {
        return Tertiary100;
    }

    public final long C() {
        return Neutral70;
    }

    public final long C0() {
        return Tertiary20;
    }

    public final long D() {
        return Neutral80;
    }

    public final long D0() {
        return Tertiary30;
    }

    public final long E() {
        return Neutral87;
    }

    public final long E0() {
        return Tertiary40;
    }

    public final long F() {
        return Neutral90;
    }

    public final long F0() {
        return Tertiary50;
    }

    public final long G() {
        return Neutral92;
    }

    public final long G0() {
        return Tertiary60;
    }

    public final long H() {
        return Neutral94;
    }

    public final long H0() {
        return Tertiary70;
    }

    public final long I() {
        return Neutral95;
    }

    public final long I0() {
        return Tertiary80;
    }

    public final long J() {
        return Neutral96;
    }

    public final long J0() {
        return Tertiary90;
    }

    public final long K() {
        return Neutral98;
    }

    public final long K0() {
        return Tertiary95;
    }

    public final long L() {
        return Neutral99;
    }

    public final long L0() {
        return Tertiary99;
    }

    public final long M() {
        return NeutralVariant0;
    }

    public final long M0() {
        return White;
    }

    public final long N() {
        return NeutralVariant10;
    }

    public final long O() {
        return NeutralVariant100;
    }

    public final long P() {
        return NeutralVariant20;
    }

    public final long Q() {
        return NeutralVariant30;
    }

    public final long R() {
        return NeutralVariant40;
    }

    public final long S() {
        return NeutralVariant50;
    }

    public final long T() {
        return NeutralVariant60;
    }

    public final long U() {
        return NeutralVariant70;
    }

    public final long V() {
        return NeutralVariant80;
    }

    public final long W() {
        return NeutralVariant90;
    }

    public final long X() {
        return NeutralVariant95;
    }

    public final long Y() {
        return NeutralVariant99;
    }

    public final long Z() {
        return Primary0;
    }

    public final long a() {
        return Black;
    }

    public final long a0() {
        return Primary10;
    }

    public final long b() {
        return Error0;
    }

    public final long b0() {
        return Primary100;
    }

    public final long c() {
        return Error10;
    }

    public final long c0() {
        return Primary20;
    }

    public final long d() {
        return Error100;
    }

    public final long d0() {
        return Primary30;
    }

    public final long e() {
        return Error20;
    }

    public final long e0() {
        return Primary40;
    }

    public final long f() {
        return Error30;
    }

    public final long f0() {
        return Primary50;
    }

    public final long g() {
        return Error40;
    }

    public final long g0() {
        return Primary60;
    }

    public final long h() {
        return Error50;
    }

    public final long h0() {
        return Primary70;
    }

    public final long i() {
        return Error60;
    }

    public final long i0() {
        return Primary80;
    }

    public final long j() {
        return Error70;
    }

    public final long j0() {
        return Primary90;
    }

    public final long k() {
        return Error80;
    }

    public final long k0() {
        return Primary95;
    }

    public final long l() {
        return Error90;
    }

    public final long l0() {
        return Primary99;
    }

    public final long m() {
        return Error95;
    }

    public final long m0() {
        return Secondary0;
    }

    public final long n() {
        return Error99;
    }

    public final long n0() {
        return Secondary10;
    }

    public final long o() {
        return Neutral0;
    }

    public final long o0() {
        return Secondary100;
    }

    public final long p() {
        return Neutral10;
    }

    public final long p0() {
        return Secondary20;
    }

    public final long q() {
        return Neutral100;
    }

    public final long q0() {
        return Secondary30;
    }

    public final long r() {
        return Neutral12;
    }

    public final long r0() {
        return Secondary40;
    }

    public final long s() {
        return Neutral17;
    }

    public final long s0() {
        return Secondary50;
    }

    public final long t() {
        return Neutral20;
    }

    public final long t0() {
        return Secondary60;
    }

    public final long u() {
        return Neutral22;
    }

    public final long u0() {
        return Secondary70;
    }

    public final long v() {
        return Neutral24;
    }

    public final long v0() {
        return Secondary80;
    }

    public final long w() {
        return Neutral30;
    }

    public final long w0() {
        return Secondary90;
    }

    public final long x() {
        return Neutral4;
    }

    public final long x0() {
        return Secondary95;
    }

    public final long y() {
        return Neutral40;
    }

    public final long y0() {
        return Secondary99;
    }

    public final long z() {
        return Neutral50;
    }

    public final long z0() {
        return Tertiary0;
    }
}
