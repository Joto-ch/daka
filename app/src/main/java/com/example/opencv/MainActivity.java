package com.example.opencv;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import org.opencv.android.BaseLoaderCallback;
import org.opencv.android.CameraBridgeViewBase;
import org.opencv.android.JavaCameraView;
import org.opencv.android.LoaderCallbackInterface;
import org.opencv.android.OpenCVLoader;
import org.opencv.android.Utils;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_sb = findViewById(R.id.btn_sb);
        Button btn_tj = findViewById(R.id.btn_tj);

        btn_sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, face_sbActivity.class));
            }
        });
        btn_tj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, face_addActivity.class));
            }
        });
    }
}


//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//}
//public class MainActivity extends AppCompatActivity {
//    private final String TAG = "MainActivity";
//    private ImageView iv_image;
//    private Button bt_test;
//
//
//    private BaseLoaderCallback mLoaderCallback = new BaseLoaderCallback(this) {
//        @Override
//        public void onManagerConnected(int status) {
//            switch (status) {
//                case LoaderCallbackInterface.SUCCESS: {
//                    Log.i(TAG, "OpenCV loaded successfully");
//                }
//                break;
//                default: {
//                    super.onManagerConnected(status);
//                }
//                break;
//            }
//        }
//    };
//
//    @Override
//    public void onResume() {
//        super.onResume();
//        if (!OpenCVLoader.initDebug()) {
//            Log.d(TAG, "Internal OpenCV library not found. Using OpenCV Manager for initialization");
//            OpenCVLoader.initAsync(OpenCVLoader.OPENCV_VERSION_3_2_0, this, mLoaderCallback);
//        } else {
//            Log.d(TAG, "OpenCV library found inside package. Using it!");
//            mLoaderCallback.onManagerConnected(LoaderCallbackInterface.SUCCESS);
//        }
//    }
//
//    @SuppressLint("CutPasteId")
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        iv_image = (ImageView) findViewById(R.id.iv_image);
//        bt_test = (Button) findViewById(R.id.bt_test);
//        final Bitmap bitmap =((BitmapDrawable)getResources().getDrawable(R.drawable.image)).getBitmap();
//        iv_image.setImageBitmap(bitmap);
//        bt_test.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Bitmap grayBitmap = toGrayByOpencv(bitmap);
//                iv_image.setImageBitmap(grayBitmap);
//            }
//        });
//    }
//
//    /**
//     * 灰度化
//     * @param srcBitmap
//     * @return
//     */
//    public Bitmap toGrayByOpencv(Bitmap srcBitmap){
//        Mat mat = new Mat();
//        Utils.bitmapToMat(srcBitmap,mat);
//        Mat grayMat = new Mat();
//        Imgproc.cvtColor(mat, grayMat, Imgproc.COLOR_BGRA2GRAY, 1);
//        Utils.matToBitmap(grayMat,srcBitmap);
//        return srcBitmap;
//    }
//
//
//}


//public class MainActivity extends AppCompatActivity implements CameraBridgeViewBase.CvCameraViewListener {
//
//
//    JavaCameraView openCvCameraView;
//    private CascadeClassifier cascadeClassifier;
//    private Mat grayscaleImage;
//    private int absoluteFaceSize;
//
//    private void initializeOpenCVDependencies() {
//        try {
//            // Copy the resource into a temp file so OpenCV can load it
//            InputStream is = getResources().openRawResource(R.raw.lbpcascade_frontalface);
//            File cascadeDir = getDir("cascade", Context.MODE_PRIVATE);
//            File mCascadeFile = new File(cascadeDir, "lbpcascade_frontalface.xml");
//            FileOutputStream os = new FileOutputStream(mCascadeFile);
//            byte[] buffer = new byte[4096];
//            int bytesRead;
//            while ((bytesRead = is.read(buffer)) != -1) {
//                os.write(buffer, 0, bytesRead);
//            }
//            is.close();
//            os.close();
//            // Load the cascade classifier
//            cascadeClassifier = new CascadeClassifier(mCascadeFile.getAbsolutePath());
//        } catch (Exception e) {
//            Log.e("OpenCVActivity", "Error loading cascade", e);
//        }
//        // And we are ready to go
//        openCvCameraView.enableView();
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.camera_avtivity);
//        openCvCameraView = (JavaCameraView) findViewById(R.id.jcv);
//        openCvCameraView.setCameraIndex(1);
//        openCvCameraView.setCvCameraViewListener(this);
//
//    }
//
//    @Override
//    public void onResume() {
//        super.onResume();
//        if (!OpenCVLoader.initDebug()) {
//            Log.e("log_wons", "OpenCV init error");
//        }
//        initializeOpenCVDependencies();
//    }
//
//    @Override
//    public void onCameraViewStarted(int width, int height) {
//        grayscaleImage = new Mat(height, width, CvType.CV_8UC4);
//
//
//        // The faces will be a 20% of the height of the screen
//        absoluteFaceSize = (int) (height * 0.2);
//    }
//
//    @Override
//    public void onCameraViewStopped() {
//    }
//
//    @Override
//    public Mat onCameraFrame(Mat aInputFrame) {
//
//        // Create a grayscale image
//        Imgproc.cvtColor(aInputFrame, grayscaleImage, Imgproc.COLOR_RGBA2RGB);
//        MatOfRect faces = new MatOfRect();
//
//        // Use the classifier to detect faces
//        if (cascadeClassifier != null) {
//            cascadeClassifier.detectMultiScale(grayscaleImage, faces, 1.1, 2, 2,
//                    new Size(absoluteFaceSize, absoluteFaceSize), new Size());
//        }
//
//        // If there are any faces found, draw a rectangle around it
//        Rect[] facesArray = faces.toArray();
//        int faceCount = facesArray.length;
//
//        for (int i = 0; i < facesArray.length; i++) {
//            Imgproc.rectangle(aInputFrame, facesArray[i].tl(), facesArray[i].br(), new Scalar(0, 255, 0, 255), 3);
//        }
//        return aInputFrame;
//    }
//}