/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
double* convertTemperature(double celsius, int* returnSize) {
    double*a=(double*)malloc(2*sizeof(double));
    int m=0;
    a[m++]=celsius+273.15;
    a[m++]=celsius*1.80+32;
    *returnSize=m;
    return a;
}