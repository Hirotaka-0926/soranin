class MergeSort implements Strategy{
void merge(int data[], int left, int mid, int right) {
    int n1 = mid - left + 1;
    int n2 = right - mid;

    int leftArray[] = new int[n1];
    int rightArray[] = new int[n2];

    for (int i = 0; i < n1; ++i)
        leftArray[i] = data[left + i];
    for (int j = 0; j < n2; ++j)
        rightArray[j] = data[mid + 1 + j];

    int i = 0, j = 0;

    int k = left;
    while (i < n1 && j < n2) {
        if (leftArray[i] <= rightArray[j]) {
            data[k] = leftArray[i];
            i++;
        } else {
            data[k] = rightArray[j];
            j++;
        }
        k++;
    }

    while (i < n1) {
        data[k] = leftArray[i];
        i++;
        k++;
    }

    while (j < n2) {
        data[k] = rightArray[j];
        j++;
        k++;
    }
}

void Msort(int data[], int left, int right) {
    if (left < right) {
        int mid = (left + right) / 2;

        Msort(data, left, mid);
        Msort(data, mid + 1, right);

        merge(data, left, mid, right);
        }
    }

    public void sort(int [] data){
        
        Msort(data, 0, data.length-1);
    }
}