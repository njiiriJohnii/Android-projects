LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := aboutpesa
LOCAL_SRC_FILES := aboutpesa.cpp

include $(BUILD_SHARED_LIBRARY)
