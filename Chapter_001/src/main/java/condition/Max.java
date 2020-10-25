package condition;
class Max {
    int max(int first, int second) {
        return first < second ? second : first;
    }
    int max(int first, int second, int third) {
        return max(max(first,second), third);
    }
    int max(int first, int second, int third, int four) {
        return max(max(first,second), max(third,four));
    }
    }