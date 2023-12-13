#include <stdio.h>

int main() {

    int i;
    
    // (initialization; condition; update;)
    for (i = 10; i <= 100; i = i + 10) {
        printf("%d ", i);
    }

    return 0;
}
