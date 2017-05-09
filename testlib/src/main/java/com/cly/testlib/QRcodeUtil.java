package com.cly.testlib;

import android.content.Context;
import android.graphics.Bitmap;

/**
 * 项目名称：app_android_dealer
 * 类描述：根据字符串信息生成二维码图片
 *
 * 创建人：Administrator
 * 创建时间：2017-02-27
 */


public class QRcodeUtil {
    private static String TAG = QRcodeUtil.class.getSimpleName();
    private static Context mContext;
    private static final int QR_WIDTH = 300;
    private static final int QR_HEIGHT = 300;

    public static Bitmap generateQRCode(Context context, String content) {
        Bitmap bitmap = null;
        mContext = context;
//        int qrWidth = DisplayUtils.dip2px(mContext, QR_WIDTH);
//        int qrHeight = DisplayUtils.dip2px(mContext, QR_HEIGHT);
//        try {
//            Hashtable<EncodeHintType, String> hints = new Hashtable<EncodeHintType, String>();
//            hints.put(EncodeHintType.CHARACTER_SET, HmcConstants.CHARSET_UTF8);
//            // 需要引入core包
//            // 把输入的文本转为二维码
//            BitMatrix bitMatrix = new QRCodeWriter().encode(content,
//                    BarcodeFormat.QR_CODE, qrWidth, qrHeight, hints);
//            LogUtil.i(TAG, "QRw:" + bitMatrix.getWidth() + "QRh:" + bitMatrix.getHeight());
//            int[] pixels = new int[qrWidth * qrHeight];
//            for (int y = 0; y < qrHeight; y++) {
//                for (int x = 0; x < qrWidth; x++) {
//                    if (bitMatrix.get(x, y)) {
//                        pixels[y * qrWidth + x] = 0xff000000;
//                    } else {
//                        pixels[y * qrWidth + x] = 0xffffffff;
//                    }
//                }
//            }
//            bitmap = Bitmap.createBitmap(qrWidth, qrHeight, Bitmap.Config.ARGB_8888);
//            bitmap.setPixels(pixels, 0, qrWidth, 0, 0, qrWidth, qrHeight);
//        } catch (WriterException e) {
//            e.printStackTrace();
//        }
        return bitmap;
    }
}
