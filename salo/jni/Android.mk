LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := salo
LOCAL_SRC_FILES := salo.cpp

include $(BUILD_SHARED_LIBRARY)
