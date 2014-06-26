#include <jni.h>

jdouble
Java_com_bmindex_MainActivity_Compute( JNIEnv*  env,
                                      jobject  this,
                                      jdouble     w,
                                      jdouble     h)
{
	double answer = w/(h*h);
	return answer;

}
//do your mathematics


