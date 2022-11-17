import com.unfixedbo1t.internal.plugins.common.dep

plugins {
    id("com.unfixedbo1t.imagerecognition.android.library")
    id("com.unfixedbo1t.imagerecognition.android.library.compose")
}

android {
    namespace = "com.unfixedbo1t.uikit"
}

dependencies {
    dep.other.apply {
        implementation(cameraCore)
        implementation(camera2)
        implementation(cameraLifecycle)
        implementation(cameraView)
    }
}