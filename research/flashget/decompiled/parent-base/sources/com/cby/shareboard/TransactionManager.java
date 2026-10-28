package com.cby.shareboard;

import android.content.Context;
import android.os.Handler;
import com.cby.shareboard.action.ActionType;
import com.cby.shareboard.model.Transaction;
import com.cby.shareboard.utils.LogUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.c0;
import kotlin.collections.u0;
import kotlin.collections.z0;
import kotlin.comparisons.a;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import kotlin.text.v;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.s0;

/* compiled from: TransactionManager.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b?\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ¥\u00012\u00020\u0001:\u0004¥\u0001¦\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u0013JC\u0010%\u001a\u00020\u000f2\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00150\u001f2\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!H\u0002¢\u0006\u0004\b%\u0010&J?\u0010)\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!2\u0006\u0010(\u001a\u00020\u0004H\u0002¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u0006¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0006¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u000f¢\u0006\u0004\b0\u0010\u0013J7\u00104\u001a\u00020\u000f2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\f\u00102\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\f\u00103\u001a\b\u0012\u0004\u0012\u00020\r0\u0015¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u0004¢\u0006\u0004\b6\u00107J\u0015\u0010:\u001a\u00020\u000f2\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J5\u0010B\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\t2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020=2\u0006\u0010@\u001a\u00020#2\u0006\u0010A\u001a\u00020#¢\u0006\u0004\bB\u0010CJ-\u0010D\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020=2\u0006\u0010@\u001a\u00020#2\u0006\u0010A\u001a\u00020#¢\u0006\u0004\bD\u0010EJ-\u0010F\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020=2\u0006\u0010@\u001a\u00020#2\u0006\u0010A\u001a\u00020#¢\u0006\u0004\bF\u0010EJE\u0010K\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\t2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020=2\u0006\u0010G\u001a\u00020#2\u0006\u0010H\u001a\u00020#2\u0006\u0010I\u001a\u00020=2\u0006\u0010J\u001a\u00020\u0004¢\u0006\u0004\bK\u0010LJ\u001d\u0010O\u001a\u00020\u000f2\u0006\u0010M\u001a\u00020=2\u0006\u0010N\u001a\u00020=¢\u0006\u0004\bO\u0010PJ\u001d\u0010S\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020=2\u0006\u0010R\u001a\u00020=¢\u0006\u0004\bS\u0010PJ\u001b\u0010U\u001a\u00020\u000f2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0004\bU\u0010VJ\u001b\u0010W\u001a\u00020\u000f2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0004\bW\u0010VJ\r\u0010X\u001a\u00020\u000f¢\u0006\u0004\bX\u0010\u0013J\u001b\u0010Y\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0015¢\u0006\u0004\bY\u0010VJ#\u0010[\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u00042\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020#0\u0015¢\u0006\u0004\b[\u0010\\J#\u0010]\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0015¢\u0006\u0004\b]\u0010\\J\u001d\u0010`\u001a\u00020\u000f2\u0006\u0010^\u001a\u00020\u00042\u0006\u0010_\u001a\u00020\u0004¢\u0006\u0004\b`\u0010aJ\r\u0010b\u001a\u00020\u000f¢\u0006\u0004\bb\u0010\u0013J\r\u0010c\u001a\u00020\u000f¢\u0006\u0004\bc\u0010\u0013J\r\u0010d\u001a\u00020\t¢\u0006\u0004\bd\u0010eJ\u0015\u0010f\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\bf\u0010gJ\u0015\u0010h\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\r¢\u0006\u0004\bh\u0010\u0011J\u001b\u0010h\u001a\u00020\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u0015¢\u0006\u0004\bh\u0010VJ\u0015\u0010i\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\r¢\u0006\u0004\bi\u0010\u001bJ\u001b\u0010i\u001a\u00020\u00062\f\u0010j\u001a\b\u0012\u0004\u0012\u00020\r0\u0015¢\u0006\u0004\bi\u0010\u0018J%\u0010i\u001a\u00020\u00062\u0006\u0010k\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010l\u001a\u00020#¢\u0006\u0004\bi\u0010mJ\u0015\u0010n\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0015¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u0004\u0018\u00010\r¢\u0006\u0004\bp\u0010qJ\r\u0010r\u001a\u00020#¢\u0006\u0004\br\u0010sJ\r\u0010t\u001a\u00020\u000f¢\u0006\u0004\bt\u0010\u0013J\u001d\u0010u\u001a\u00020\u000f2\u0006\u0010k\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u0004¢\u0006\u0004\bu\u0010vJ\u001d\u0010w\u001a\u00020\u000f2\u0006\u0010k\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u0004¢\u0006\u0004\bw\u0010vJ\u0015\u0010x\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u0004¢\u0006\u0004\bx\u00107J\r\u0010y\u001a\u00020\u000f¢\u0006\u0004\by\u0010\u0013J\r\u0010z\u001a\u00020\u000f¢\u0006\u0004\bz\u0010\u0013J1\u0010{\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u001f2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0015¢\u0006\u0004\b{\u0010|J\u0016\u0010\u007f\u001a\u00020\u000f2\u0006\u0010~\u001a\u00020}¢\u0006\u0005\b\u007f\u0010\u0080\u0001J!\u0010\u0081\u0001\u001a\u00020\u000f2\u000e\u0010j\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0015H\u0016¢\u0006\u0005\b\u0081\u0001\u0010VJ)\u0010\u0084\u0001\u001a\u00020\u000f2\u0007\u0010\u0082\u0001\u001a\u00020\u00042\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\u0015H\u0016¢\u0006\u0005\b\u0084\u0001\u0010\\J)\u0010\u0085\u0001\u001a\u00020\u000f2\u0007\u0010\u0082\u0001\u001a\u00020\u00042\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\u0015H\u0016¢\u0006\u0005\b\u0085\u0001\u0010\\J\u0019\u0010\u0086\u0001\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0005\b\u0086\u0001\u00107J-\u0010\u0086\u0001\u001a\u00020\u000f2\u0019\u0010\u0087\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u001fH\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0088\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010\u0089\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u008a\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u008b\u0001R\u0015\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010\u008b\u0001R\u0017\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\n\u0010\u008c\u0001R!\u0010\u0092\u0001\u001a\u00030\u008d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0017\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b.\u0010\u008b\u0001R\u0017\u0010\u0019\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0019\u0010\u0093\u0001R\u001c\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001c\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0019\u0010\u009a\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u008c\u0001R\u001b\u0010\u009b\u0001\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0019\u0010\u009d\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001d\u0010\u009f\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001d\u0010¡\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010 \u0001R\u0018\u0010£\u0001\u001a\u00030¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001¨\u0006§\u0001"}, d2 = {"Lcom/cby/shareboard/TransactionManager;", "Lcom/cby/shareboard/TransactionObserver;", "Landroid/content/Context;", "context", "", "channelId", "", "needPushData", "needPullData", "", "timeTaskPeriod", "<init>", "(Landroid/content/Context;Ljava/lang/String;ZZJ)V", "Lcom/cby/shareboard/model/Transaction;", "t", "Lkotlin/k2;", "pack", "(Lcom/cby/shareboard/model/Transaction;)V", "sendCacheTransactionByForward", "()V", "sendCacheTransactionByService", "", "list", "hasImageTransaction", "(Ljava/util/List;)Z", "transaction", "isImageTransaction", "(Lcom/cby/shareboard/model/Transaction;)Z", "getImageTransactionsBefore", "(Ljava/util/List;)Ljava/util/List;", "releaseCheckMissingStepsJob", "", "dataListGroupedByUserId", "", "", "", "missingStepsByUserId", "processUserGroups", "(Ljava/util/Map;Ljava/util/Map;)V", "sortedDataList", "userId", "findAndRecordMissingSteps", "(Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)V", "connected", "setForwardConnected", "(Z)V", "isForwardConnected", "()Z", "reset", "totalCache", "unConfirmedList", "unSentRemoteList", "initCache", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "setUserId", "(Ljava/lang/String;)V", "Lcom/cby/shareboard/action/ActionType;", "actionType", "setActionType", "(Lcom/cby/shareboard/action/ActionType;)V", "id", "", "x", "y", "size", "color", "sendStartTransaction", "(JFFII)V", "sendMoveTransaction", "(FFII)V", "sendEndTransaction", "width", "height", "scale", "image", "sendImageTransaction", "(JFFIIFLjava/lang/String;)V", "tx", "ty", "sendTranslateTransaction", "(FF)V", "sx", "sy", "sendScaleTransaction", "ids", "sendRevokeTransaction", "(Ljava/util/List;)V", "sendRedoTransaction", "sendClearTransaction", "hasSentToService", "noList", "reSendMissingTransaction", "(Ljava/lang/String;Ljava/util/List;)V", "reSendUnConfirmTransaction", "sessionId", "data", "onReceive", "(Ljava/lang/String;Ljava/lang/String;)V", "end", "releaseTimer", "getTimeTaskPeriod", "()J", "setTimeTaskPeriod", "(J)V", "saveToTotalCache", "isInTotalCache", "transactions", "pageId", "no", "(JLjava/lang/String;I)Z", "getTotalCacheList", "()Ljava/util/List;", "getLastData", "()Lcom/cby/shareboard/model/Transaction;", "getTotalCacheSize", "()I", "clearAllTotalCache", "clearTotalCacheBeforePage", "(JLjava/lang/String;)V", "clearTotalCacheByPage", "clearTotalCacheByUser", "checkAndGroupReceivedDataMissingStepsByUserId", "checkAndRequestMissingDataWhenLastDataIsNotEndFrame", "getMissingStepsByUserId", "(Ljava/util/List;)Ljava/util/Map;", "Lcom/cby/shareboard/TransactionManager$TransactionListener;", "listener", "setListener", "(Lcom/cby/shareboard/TransactionManager$TransactionListener;)V", "onTransaction", "jsonData", "sourceDatas", "sendToRemoteByForward", "sendToRemoteByService", "requestMissingData", "missingData", "(Ljava/util/Map;)V", "Landroid/content/Context;", "Ljava/lang/String;", "Z", "J", "Lcom/cby/shareboard/utils/LogUtils;", "logger$delegate", "Lkotlin/b0;", "getLogger", "()Lcom/cby/shareboard/utils/LogUtils;", "logger", "Lcom/cby/shareboard/model/Transaction;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Lkotlinx/coroutines/k2;", "mCheckMissingStepsJob", "Lkotlinx/coroutines/k2;", "mLastReceiveDataTime", "mTransactionListener", "Lcom/cby/shareboard/TransactionManager$TransactionListener;", "scanCacheTimes", "I", "toBeSendByForwardCache", "Ljava/util/List;", "toBeSendByServiceCache", "Ljava/lang/Runnable;", "timerTask", "Ljava/lang/Runnable;", "Companion", "TransactionListener", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nTransactionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionManager.kt\ncom/cby/shareboard/TransactionManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,741:1\n1054#2:742\n1747#2,3:743\n1045#2:746\n1855#2,2:747\n1054#2:749\n1963#2,14:750\n1477#2:764\n1502#2,3:765\n1505#2,3:775\n1045#2:779\n1855#2:781\n1856#2:789\n372#3,7:768\n372#3,7:782\n215#4:778\n216#4:780\n*S KotlinDebug\n*F\n+ 1 TransactionManager.kt\ncom/cby/shareboard/TransactionManager\n*L\n144#1:742\n321#1:743,3\n372#1:746\n372#1:747,2\n523#1:749\n609#1:750,14\n629#1:764\n629#1:765,3\n629#1:775,3\n647#1:779\n667#1:781\n667#1:789\n629#1:768,7\n668#1:782,7\n645#1:778\n645#1:780\n*E\n"})
/* loaded from: classes3.dex */
public final class TransactionManager implements TransactionObserver {

    /* renamed from: Companion, reason: from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion(null);
    private static final int FORWARD_SEND_COUNT_THRESHOLD = 32;
    private static final int SERVICE_SEND_COUNT_THRESHOLD = 100;
    public static final long TIMER_TASK_PERIOD = 32;
    private static boolean testSendDataByForward;

    @l
    private final String channelId;

    @l
    private final Context context;

    @m
    private Handler handler;
    private boolean isForwardConnected;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @l
    private final b0 logger;

    @m
    private k2 mCheckMissingStepsJob;
    private long mLastReceiveDataTime;

    @m
    private TransactionListener mTransactionListener;
    private final boolean needPullData;
    private final boolean needPushData;
    private int scanCacheTimes;
    private long timeTaskPeriod;

    @l
    private final Runnable timerTask;

    @l
    private final List<Transaction> toBeSendByForwardCache;

    @l
    private final List<Transaction> toBeSendByServiceCache;

    @l
    private Transaction transaction;

    /* compiled from: TransactionManager.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/cby/shareboard/TransactionManager$Companion;", "", "()V", "FORWARD_SEND_COUNT_THRESHOLD", "", "SERVICE_SEND_COUNT_THRESHOLD", "TIMER_TASK_PERIOD", "", "testSendDataByForward", "", "getTestSendDataByForward", "()Z", "setTestSendDataByForward", "(Z)V", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(w wVar) {
            this();
        }

        public final boolean getTestSendDataByForward() {
            return TransactionManager.testSendDataByForward;
        }

        public final void setTestSendDataByForward(boolean z4) {
            TransactionManager.testSendDataByForward = z4;
        }

        private Companion() {
        }
    }

    /* compiled from: TransactionManager.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ)\u0010\u0015\u001a\u00020\u00042\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/cby/shareboard/TransactionManager$TransactionListener;", "", "Lcom/cby/shareboard/model/Transaction;", "transaction", "Lkotlin/k2;", "onPack", "(Lcom/cby/shareboard/model/Transaction;)V", "", "transactions", "onTransaction", "(Ljava/util/List;)V", "", "jsonData", "sourceDatas", "sendToRemoteByForward", "(Ljava/lang/String;Ljava/util/List;)V", "sendToRemoteByService", "", "", "", "missingData", "requestMissingData", "(Ljava/util/Map;)V", "userId", "(Ljava/lang/String;)V", "", "pageId", "onClearCacheByPage", "(JLjava/lang/String;)V", "onClearCacheBeforePage", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface TransactionListener {

        /* compiled from: TransactionManager.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static void onClearCacheBeforePage(@l TransactionListener transactionListener, long j4, @l String str) {
                l0.p(str, ProtectedSandApp.s("ૢ"));
            }

            public static void onClearCacheByPage(@l TransactionListener transactionListener, long j4, @l String str) {
                l0.p(str, ProtectedSandApp.s("ૢ"));
            }

            public static void onPack(@l TransactionListener transactionListener, @l Transaction transaction) {
                l0.p(transaction, ProtectedSandApp.s("ૣ"));
            }

            public static void onTransaction(@l TransactionListener transactionListener, @l List<Transaction> list) {
                l0.p(list, ProtectedSandApp.s("\u0ae4"));
            }

            public static void requestMissingData(@l TransactionListener transactionListener, @l String str) {
                l0.p(str, ProtectedSandApp.s("ૢ"));
            }

            public static void sendToRemoteByForward(@l TransactionListener transactionListener, @l String str, @l List<Transaction> list) {
                l0.p(str, ProtectedSandApp.s("૦"));
                l0.p(list, ProtectedSandApp.s("૧"));
            }

            public static void sendToRemoteByService(@l TransactionListener transactionListener, @l String str, @l List<Transaction> list) {
                l0.p(str, ProtectedSandApp.s("૦"));
                l0.p(list, ProtectedSandApp.s("૧"));
            }

            public static void requestMissingData(@l TransactionListener transactionListener, @l Map<String, ? extends List<Integer>> map) {
                l0.p(map, ProtectedSandApp.s("\u0ae5"));
            }
        }

        void onClearCacheBeforePage(long pageId, @l String userId);

        void onClearCacheByPage(long pageId, @l String userId);

        void onPack(@l Transaction transaction);

        void onTransaction(@l List<Transaction> transactions);

        void requestMissingData(@l String userId);

        void requestMissingData(@l Map<String, ? extends List<Integer>> missingData);

        void sendToRemoteByForward(@l String jsonData, @l List<Transaction> sourceDatas);

        void sendToRemoteByService(@l String jsonData, @l List<Transaction> sourceDatas);
    }

    public TransactionManager(@l Context context, @l String str, boolean z4, boolean z5, long j4) {
        l0.p(context, ProtectedSandApp.s("૪"));
        l0.p(str, ProtectedSandApp.s("૫"));
        this.context = context;
        this.channelId = str;
        this.needPushData = z4;
        this.needPullData = z5;
        this.timeTaskPeriod = j4;
        this.logger = c0.c(new TransactionManager$logger$2(this));
        this.toBeSendByForwardCache = new ArrayList(1000);
        this.toBeSendByServiceCache = new ArrayList(1000);
        Runnable runnable = new Runnable() { // from class: com.cby.shareboard.TransactionManager$timerTask$1
            @Override // java.lang.Runnable
            public void run() {
                boolean z6;
                boolean z7;
                int i4;
                Handler handler;
                int i5;
                int i6;
                long j5;
                long j6;
                int i7;
                int i10;
                int i11;
                TransactionManager transactionManager = TransactionManager.this;
                z6 = transactionManager.needPushData;
                if (z6) {
                    if (TransactionManager.INSTANCE.getTestSendDataByForward()) {
                        i11 = transactionManager.scanCacheTimes;
                        if (i11 % 150 == 0) {
                            transactionManager.sendCacheTransactionByForward();
                        }
                    } else {
                        transactionManager.sendCacheTransactionByForward();
                    }
                    i10 = transactionManager.scanCacheTimes;
                    if (i10 % 150 == 0) {
                        transactionManager.sendCacheTransactionByService();
                    }
                }
                z7 = transactionManager.needPullData;
                if (z7) {
                    i5 = transactionManager.scanCacheTimes;
                    if (i5 != 0) {
                        i7 = transactionManager.scanCacheTimes;
                        if (i7 % 100 == 0) {
                            transactionManager.checkAndGroupReceivedDataMissingStepsByUserId();
                        }
                    }
                    i6 = transactionManager.scanCacheTimes;
                    if (i6 % 100 == 0) {
                        j5 = transactionManager.mLastReceiveDataTime;
                        if (j5 != 0) {
                            long currentTimeMillis = System.currentTimeMillis();
                            j6 = transactionManager.mLastReceiveDataTime;
                            if (currentTimeMillis - j6 > 3000) {
                                transactionManager.checkAndRequestMissingDataWhenLastDataIsNotEndFrame();
                            }
                        }
                    }
                }
                i4 = transactionManager.scanCacheTimes;
                transactionManager.scanCacheTimes = i4 + 1;
                handler = TransactionManager.this.handler;
                if (handler != null) {
                    handler.postDelayed(this, 32L);
                }
            }
        };
        this.timerTask = runnable;
        if (z4 || z5) {
            Handler handler = new Handler(context.getMainLooper());
            this.handler = handler;
            handler.postDelayed(runnable, this.timeTaskPeriod);
        }
        Transaction m7clone = new Transaction(0L, 0L, null, 0L, (byte) 0, 0, 0.0f, 0.0f, 0, 0, 0, null, null, 8191, null).m7clone();
        this.transaction = m7clone;
        m7clone.setPageId(System.currentTimeMillis());
        TransactionCenter.INSTANCE.getInstance().registerObserver(str, this);
    }

    private final void findAndRecordMissingSteps(List<Transaction> sortedDataList, Map<String, List<Integer>> missingStepsByUserId, String userId) {
        int i4 = -1;
        for (Transaction transaction : sortedDataList) {
            int i5 = i4 + 1;
            if (transaction.getNo() != i5) {
                Iterator<Integer> it = s.W1(i5, transaction.getNo()).iterator();
                while (it.hasNext()) {
                    int c5 = ((u0) it).c();
                    List<Integer> list = missingStepsByUserId.get(userId);
                    if (list == null) {
                        list = new ArrayList<>();
                        missingStepsByUserId.put(userId, list);
                    }
                    list.add(Integer.valueOf(c5));
                }
            }
            i4 = transaction.getNo();
        }
    }

    private final List<Transaction> getImageTransactionsBefore(List<Transaction> list) {
        ArrayList arrayList = new ArrayList();
        for (Transaction transaction : list) {
            if (isImageTransaction(transaction)) {
                return arrayList;
            }
            arrayList.add(transaction);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LogUtils getLogger() {
        return (LogUtils) this.logger.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Map getMissingStepsByUserId$default(TransactionManager transactionManager, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = null;
        }
        return transactionManager.getMissingStepsByUserId(list);
    }

    private final boolean hasImageTransaction(List<Transaction> list) {
        List<Transaction> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (isImageTransaction((Transaction) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean isImageTransaction(Transaction transaction) {
        return transaction.getActionType() == ActionType.Image.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x000f, B:10:0x0027, B:12:0x0038, B:17:0x0019), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void pack(com.cby.shareboard.model.Transaction r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            byte r0 = r3.getStep()     // Catch: java.lang.Throwable -> L17
            r1 = 1
            if (r0 == r1) goto L19
            byte r0 = r3.getStep()     // Catch: java.lang.Throwable -> L17
            r1 = 2
            if (r0 == r1) goto L19
            byte r0 = r3.getStep()     // Catch: java.lang.Throwable -> L17
            r1 = 3
            if (r0 != r1) goto L27
            goto L19
        L17:
            r3 = move-exception
            goto L3d
        L19:
            int r0 = r3.getActionType()     // Catch: java.lang.Throwable -> L17
            com.cby.shareboard.action.ActionType r1 = com.cby.shareboard.action.ActionType.UnKnow     // Catch: java.lang.Throwable -> L17
            int r1 = r1.getValue()     // Catch: java.lang.Throwable -> L17
            if (r0 != r1) goto L27
            monitor-exit(r2)
            return
        L27:
            java.util.List<com.cby.shareboard.model.Transaction> r0 = r2.toBeSendByForwardCache     // Catch: java.lang.Throwable -> L17
            r0.add(r3)     // Catch: java.lang.Throwable -> L17
            java.util.List<com.cby.shareboard.model.Transaction> r0 = r2.toBeSendByServiceCache     // Catch: java.lang.Throwable -> L17
            r0.add(r3)     // Catch: java.lang.Throwable -> L17
            r2.saveToTotalCache(r3)     // Catch: java.lang.Throwable -> L17
            com.cby.shareboard.TransactionManager$TransactionListener r0 = r2.mTransactionListener     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L3b
            r0.onPack(r3)     // Catch: java.lang.Throwable -> L17
        L3b:
            monitor-exit(r2)
            return
        L3d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cby.shareboard.TransactionManager.pack(com.cby.shareboard.model.Transaction):void");
    }

    private final void processUserGroups(Map<String, ? extends List<Transaction>> dataListGroupedByUserId, Map<String, List<Integer>> missingStepsByUserId) {
        for (Map.Entry<String, ? extends List<Transaction>> entry : dataListGroupedByUserId.entrySet()) {
            findAndRecordMissingSteps(kotlin.collections.w.u5(entry.getValue(), new Comparator() { // from class: com.cby.shareboard.TransactionManager$processUserGroups$lambda$11$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t4, T t5) {
                    return a.l(Integer.valueOf(((Transaction) t4).getNo()), Integer.valueOf(((Transaction) t5).getNo()));
                }
            }), missingStepsByUserId, entry.getKey());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseCheckMissingStepsJob() {
        k2 k2Var = this.mCheckMissingStepsJob;
        if (k2Var != null) {
            k2.a.b(k2Var, null, 1, null);
        }
        this.mCheckMissingStepsJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendCacheTransactionByForward() {
        int size;
        if (getIsForwardConnected() && (size = this.toBeSendByForwardCache.size()) != 0) {
            getLogger().debug(ProtectedSandApp.s("૬") + size);
            List<Transaction> subList = size < 32 ? this.toBeSendByForwardCache : this.toBeSendByForwardCache.subList(0, 32);
            if (!hasImageTransaction(subList)) {
                ArrayList arrayList = new ArrayList(subList);
                TransactionCenter.INSTANCE.getInstance().sendToRemoteByForward(this.channelId, arrayList);
                this.toBeSendByForwardCache.removeAll(arrayList);
            } else {
                Transaction transaction = subList.get(0);
                ArrayList arrayList2 = new ArrayList(isImageTransaction(transaction) ? kotlin.collections.w.s(transaction) : getImageTransactionsBefore(subList));
                TransactionCenter.INSTANCE.getInstance().sendToRemoteByForward(this.channelId, arrayList2);
                this.toBeSendByForwardCache.removeAll(arrayList2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendCacheTransactionByService() {
        int size = this.toBeSendByServiceCache.size();
        if (size == 0) {
            return;
        }
        getLogger().debug(ProtectedSandApp.s("૭") + size);
        List<Transaction> subList = size < 100 ? this.toBeSendByServiceCache : this.toBeSendByServiceCache.subList(0, 100);
        if (!hasImageTransaction(subList)) {
            TransactionCenter.INSTANCE.getInstance().sendToRemoteByService(this.channelId, new ArrayList(subList));
        } else {
            Transaction transaction = subList.get(0);
            TransactionCenter.INSTANCE.getInstance().sendToRemoteByService(this.channelId, new ArrayList(isImageTransaction(transaction) ? kotlin.collections.w.s(transaction) : getImageTransactionsBefore(subList)));
        }
    }

    public final void checkAndGroupReceivedDataMissingStepsByUserId() {
        k2 f4;
        releaseCheckMissingStepsJob();
        if (getIsForwardConnected()) {
            getLogger().debug(ProtectedSandApp.s("૮"));
            f4 = k.f(s0.a(j1.c()), null, null, new TransactionManager$checkAndGroupReceivedDataMissingStepsByUserId$1(this, null), 3, null);
            this.mCheckMissingStepsJob = f4;
        }
    }

    public final void checkAndRequestMissingDataWhenLastDataIsNotEndFrame() {
        Object obj;
        if (getIsForwardConnected()) {
            getLogger().debug(ProtectedSandApp.s("૯"));
            List<Transaction> totalCacheList = getTotalCacheList();
            List<Transaction> list = totalCacheList;
            if (list == null || list.isEmpty()) {
                return;
            }
            Iterator<T> it = totalCacheList.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    long timestamp = ((Transaction) next).getTimestamp();
                    do {
                        Object next2 = it.next();
                        long timestamp2 = ((Transaction) next2).getTimestamp();
                        if (timestamp < timestamp2) {
                            next = next2;
                            timestamp = timestamp2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            Transaction transaction = (Transaction) obj;
            if (transaction == null || !transaction.isNotEndFrameStep()) {
                return;
            }
            TransactionCenter.INSTANCE.getInstance().requestMissingData(this.channelId, transaction.getUserId());
        }
    }

    public final void clearAllTotalCache() {
        releaseCheckMissingStepsJob();
        TransactionCenter.INSTANCE.getInstance().clearAllTotalCache();
    }

    public final void clearTotalCacheBeforePage(long pageId, @l String userId) {
        l0.p(userId, ProtectedSandApp.s("૰"));
        releaseCheckMissingStepsJob();
        TransactionCenter.INSTANCE.getInstance().clearTotalCacheBeforePage(pageId, userId);
        TransactionListener transactionListener = this.mTransactionListener;
        if (transactionListener != null) {
            transactionListener.onClearCacheBeforePage(pageId, userId);
        }
    }

    public final void clearTotalCacheByPage(long pageId, @l String userId) {
        l0.p(userId, ProtectedSandApp.s("૰"));
        releaseCheckMissingStepsJob();
        TransactionCenter.INSTANCE.getInstance().clearTotalCacheByPage(pageId, userId);
        TransactionListener transactionListener = this.mTransactionListener;
        if (transactionListener != null) {
            transactionListener.onClearCacheByPage(pageId, userId);
        }
    }

    public final void clearTotalCacheByUser(@l String userId) {
        l0.p(userId, ProtectedSandApp.s("૰"));
        releaseCheckMissingStepsJob();
        TransactionCenter.INSTANCE.getInstance().clearTotalCacheByUser(userId);
    }

    public final void end() {
        releaseTimer();
        TransactionCenter.INSTANCE.getInstance().end();
    }

    @m
    public final Transaction getLastData() {
        List u5;
        List<Transaction> totalCacheList = getTotalCacheList();
        if (totalCacheList == null || (u5 = kotlin.collections.w.u5(totalCacheList, new Comparator() { // from class: com.cby.shareboard.TransactionManager$getLastData$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t4, T t5) {
                return a.l(Long.valueOf(((Transaction) t5).getTimestamp()), Long.valueOf(((Transaction) t4).getTimestamp()));
            }
        })) == null) {
            return null;
        }
        return (Transaction) kotlin.collections.w.W2(u5, 0);
    }

    @l
    public final Map<String, List<Integer>> getMissingStepsByUserId(@m List<Transaction> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list == null) {
            list = getTotalCacheList();
        }
        List<Transaction> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return z0.z();
        }
        try {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj : list) {
                String userId = ((Transaction) obj).getUserId();
                Object obj2 = linkedHashMap2.get(userId);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap2.put(userId, obj2);
                }
                ((List) obj2).add(obj);
            }
            processUserGroups(linkedHashMap2, linkedHashMap);
        } catch (Exception e4) {
            getLogger().error(ProtectedSandApp.s("૱") + e4.getMessage());
        }
        return linkedHashMap;
    }

    public final long getTimeTaskPeriod() {
        return this.timeTaskPeriod;
    }

    @m
    public final List<Transaction> getTotalCacheList() {
        return TransactionCenter.INSTANCE.getInstance().getTotalCacheList();
    }

    public final int getTotalCacheSize() {
        return TransactionCenter.INSTANCE.getInstance().getTotalCacheSize();
    }

    public final void hasSentToService(@l List<Transaction> list) {
        l0.p(list, ProtectedSandApp.s("\u0af2"));
        this.toBeSendByServiceCache.removeAll(list);
    }

    public final void initCache(@l List<Transaction> totalCache, @l List<Transaction> unConfirmedList, @l List<Transaction> unSentRemoteList) {
        l0.p(totalCache, ProtectedSandApp.s("\u0af3"));
        l0.p(unConfirmedList, ProtectedSandApp.s("\u0af4"));
        l0.p(unSentRemoteList, ProtectedSandApp.s("\u0af5"));
        List u5 = kotlin.collections.w.u5(totalCache, new Comparator() { // from class: com.cby.shareboard.TransactionManager$initCache$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t4, T t5) {
                return a.l(Long.valueOf(((Transaction) t5).getTimestamp()), Long.valueOf(((Transaction) t4).getTimestamp()));
            }
        });
        clearAllTotalCache();
        this.toBeSendByForwardCache.clear();
        this.toBeSendByForwardCache.addAll(unConfirmedList);
        this.toBeSendByServiceCache.clear();
        this.toBeSendByServiceCache.addAll(unSentRemoteList);
        Transaction transaction = this.transaction;
        Transaction transaction2 = (Transaction) kotlin.collections.w.W2(u5, 0);
        transaction.setPageId(transaction2 != null ? transaction2.getPageId() : System.currentTimeMillis());
        Transaction transaction3 = this.transaction;
        Transaction transaction4 = (Transaction) kotlin.collections.w.W2(u5, 0);
        transaction3.setNo(transaction4 != null ? transaction4.getNo() : -1);
    }

    /* renamed from: isForwardConnected, reason: from getter */
    public final boolean getIsForwardConnected() {
        return this.isForwardConnected;
    }

    public final boolean isInTotalCache(@l Transaction transaction) {
        l0.p(transaction, ProtectedSandApp.s("\u0af6"));
        return TransactionCenter.INSTANCE.getInstance().isInTotalCache(transaction);
    }

    public final void onReceive(@l String sessionId, @l String data) {
        l0.p(sessionId, ProtectedSandApp.s("\u0af8"));
        l0.p(data, ProtectedSandApp.s("ૹ"));
        getLogger().debug(ProtectedSandApp.s("ૺ") + sessionId + ProtectedSandApp.s("ૻ") + data);
        TransactionCenter.INSTANCE.getInstance().onReceive(sessionId, data);
    }

    @Override // com.cby.shareboard.TransactionObserver
    public void onTransaction(@l List<Transaction> transactions) {
        l0.p(transactions, ProtectedSandApp.s("\u0af7"));
        this.mLastReceiveDataTime = System.currentTimeMillis();
        TransactionListener transactionListener = this.mTransactionListener;
        if (transactionListener != null) {
            transactionListener.onTransaction(transactions);
        }
    }

    public final void reSendMissingTransaction(@l String userId, @l List<Integer> noList) {
        List<Transaction> u5;
        l0.p(userId, ProtectedSandApp.s("૰"));
        l0.p(noList, ProtectedSandApp.s("ૼ"));
        if (v.S1(userId)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ଁ"));
        }
        if (noList.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u0b00"));
        }
        HashSet T5 = kotlin.collections.w.T5(noList);
        synchronized (this) {
            List<Transaction> totalCacheList = getTotalCacheList();
            if (totalCacheList != null && (u5 = kotlin.collections.w.u5(totalCacheList, new Comparator() { // from class: com.cby.shareboard.TransactionManager$reSendMissingTransaction$lambda$4$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t4, T t5) {
                    return a.l(Integer.valueOf(((Transaction) t4).getNo()), Integer.valueOf(((Transaction) t5).getNo()));
                }
            })) != null) {
                for (Transaction transaction : u5) {
                    if (l0.g(transaction.getUserId(), userId) && T5.contains(Integer.valueOf(transaction.getNo()))) {
                        try {
                            this.toBeSendByForwardCache.add(transaction);
                            getLogger().debug(ProtectedSandApp.s("૽") + transaction.getUserId() + ProtectedSandApp.s("૾") + transaction.getNo());
                        } catch (Exception e4) {
                            getLogger().error(ProtectedSandApp.s("૿") + e4.getMessage());
                        }
                    }
                }
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            }
        }
    }

    public final void reSendUnConfirmTransaction(@l String userId, @l List<Transaction> list) {
        l0.p(userId, ProtectedSandApp.s("૰"));
        l0.p(list, ProtectedSandApp.s("\u0af2"));
        if (v.S1(userId) || list.isEmpty()) {
            return;
        }
        HashSet T5 = kotlin.collections.w.T5(list);
        synchronized (this) {
            Iterator it = T5.iterator();
            while (it.hasNext()) {
                Transaction transaction = (Transaction) it.next();
                if (!this.toBeSendByForwardCache.contains(transaction)) {
                    try {
                        List<Transaction> list2 = this.toBeSendByForwardCache;
                        l0.m(transaction);
                        list2.add(transaction);
                        getLogger().debug(ProtectedSandApp.s("૽") + transaction.getUserId() + ProtectedSandApp.s("૾") + transaction.getNo());
                    } catch (Exception e4) {
                        getLogger().error(ProtectedSandApp.s("૿") + e4.getMessage());
                    }
                }
            }
            kotlin.k2 k2Var = kotlin.k2.f75408a;
        }
    }

    public final void releaseTimer() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacks(this.timerTask);
        }
        releaseCheckMissingStepsJob();
    }

    @Override // com.cby.shareboard.TransactionObserver
    public void requestMissingData(@l String userId) {
        l0.p(userId, ProtectedSandApp.s("૰"));
        TransactionListener transactionListener = this.mTransactionListener;
        if (transactionListener != null) {
            transactionListener.requestMissingData(userId);
        }
    }

    public final void reset() {
        this.transaction.setNo(-1);
        this.transaction.setPageId(System.currentTimeMillis() + 1);
    }

    public final void saveToTotalCache(@l Transaction transaction) {
        l0.p(transaction, ProtectedSandApp.s("\u0af6"));
        TransactionCenter.INSTANCE.getInstance().saveToTotalCache(transaction);
    }

    public final synchronized void sendClearTransaction() {
        this.transaction.setId(System.currentTimeMillis());
        Transaction transaction = this.transaction;
        transaction.setNo(transaction.getNo() + 1);
        pack(this.transaction.m7clone().makeClearSelfTransaction());
        reset();
    }

    public final synchronized void sendEndTransaction(float x4, float y4, int size, int color) {
        Transaction transaction = this.transaction;
        transaction.setNo(transaction.getNo() + 1);
        pack(this.transaction.m7clone().makeEndTransaction(x4, y4, size, color));
    }

    public final synchronized void sendImageTransaction(long id2, float x4, float y4, int width, int height, float scale, @l String image) {
        l0.p(image, ProtectedSandApp.s("ଃ"));
        this.transaction.setId(id2);
        Transaction transaction = this.transaction;
        transaction.setNo(transaction.getNo() + 1);
        pack(this.transaction.m7clone().makeImageTransaction(x4, y4, width, height, scale, image));
    }

    public final synchronized void sendMoveTransaction(float x4, float y4, int size, int color) {
        Transaction transaction = this.transaction;
        transaction.setNo(transaction.getNo() + 1);
        pack(this.transaction.m7clone().makeMoveTransaction(x4, y4, size, color));
    }

    public final synchronized void sendRedoTransaction(@l List<Long> ids) {
        l0.p(ids, ProtectedSandApp.s("\u0b04"));
        this.transaction.setId(System.currentTimeMillis());
        Transaction transaction = this.transaction;
        transaction.setNo(transaction.getNo() + 1);
        pack(this.transaction.m7clone().makeRedoTransaction(ids));
    }

    public final synchronized void sendRevokeTransaction(@l List<Long> ids) {
        l0.p(ids, ProtectedSandApp.s("\u0b04"));
        this.transaction.setId(System.currentTimeMillis());
        Transaction transaction = this.transaction;
        transaction.setNo(transaction.getNo() + 1);
        pack(this.transaction.m7clone().makeRevokeTransaction(ids));
    }

    public final synchronized void sendScaleTransaction(float sx, float sy) {
        this.transaction.setId(System.currentTimeMillis());
        Transaction transaction = this.transaction;
        transaction.setNo(transaction.getNo() + 1);
        pack(this.transaction.m7clone().makeScaleTransaction(sx, sy));
    }

    public final synchronized void sendStartTransaction(long id2, float x4, float y4, int size, int color) {
        this.transaction.setId(id2);
        Transaction transaction = this.transaction;
        transaction.setNo(transaction.getNo() + 1);
        pack(this.transaction.m7clone().makeStartTransaction(x4, y4, size, color));
    }

    @Override // com.cby.shareboard.TransactionObserver
    public void sendToRemoteByForward(@l String jsonData, @l List<Transaction> sourceDatas) {
        l0.p(jsonData, ProtectedSandApp.s("ଅ"));
        l0.p(sourceDatas, ProtectedSandApp.s("ଆ"));
        TransactionListener transactionListener = this.mTransactionListener;
        if (transactionListener != null) {
            transactionListener.sendToRemoteByForward(jsonData, sourceDatas);
        }
    }

    @Override // com.cby.shareboard.TransactionObserver
    public void sendToRemoteByService(@l String jsonData, @l List<Transaction> sourceDatas) {
        l0.p(jsonData, ProtectedSandApp.s("ଅ"));
        l0.p(sourceDatas, ProtectedSandApp.s("ଆ"));
        TransactionListener transactionListener = this.mTransactionListener;
        if (transactionListener != null) {
            transactionListener.sendToRemoteByService(jsonData, sourceDatas);
        }
    }

    public final synchronized void sendTranslateTransaction(float tx, float ty) {
        this.transaction.setId(System.currentTimeMillis());
        Transaction transaction = this.transaction;
        transaction.setNo(transaction.getNo() + 1);
        pack(this.transaction.m7clone().makeTranslateTransaction(tx, ty));
    }

    public final void setActionType(@l ActionType actionType) {
        l0.p(actionType, ProtectedSandApp.s("ଇ"));
        this.transaction.setActionType(actionType.getValue());
    }

    public final void setForwardConnected(boolean connected) {
        this.isForwardConnected = connected;
    }

    public final void setListener(@l TransactionListener listener) {
        l0.p(listener, ProtectedSandApp.s("ଈ"));
        this.mTransactionListener = listener;
    }

    public final void setTimeTaskPeriod(long timeTaskPeriod) {
        this.timeTaskPeriod = timeTaskPeriod;
    }

    public final void setUserId(@l String userId) {
        l0.p(userId, ProtectedSandApp.s("૰"));
        this.transaction.setUserId(userId);
    }

    public final boolean isInTotalCache(@l List<Transaction> transactions) {
        l0.p(transactions, ProtectedSandApp.s("\u0af7"));
        return TransactionCenter.INSTANCE.getInstance().isInTotalCache(transactions);
    }

    @Override // com.cby.shareboard.TransactionObserver
    public void requestMissingData(@l Map<String, ? extends List<Integer>> missingData) {
        l0.p(missingData, ProtectedSandApp.s("ଂ"));
        TransactionListener transactionListener = this.mTransactionListener;
        if (transactionListener != null) {
            transactionListener.requestMissingData(missingData);
        }
    }

    public final void saveToTotalCache(@l List<Transaction> transaction) {
        l0.p(transaction, ProtectedSandApp.s("\u0af6"));
        TransactionCenter.INSTANCE.getInstance().saveToTotalCache(transaction);
    }

    public final boolean isInTotalCache(long pageId, @l String userId, int no) {
        l0.p(userId, ProtectedSandApp.s("૰"));
        return TransactionCenter.INSTANCE.getInstance().isInTotalCache(pageId, userId, no);
    }

    public /* synthetic */ TransactionManager(Context context, String str, boolean z4, boolean z5, long j4, int i4, w wVar) {
        this(context, str, (i4 & 4) != 0 ? true : z4, (i4 & 8) != 0 ? true : z5, (i4 & 16) != 0 ? 32L : j4);
    }
}
