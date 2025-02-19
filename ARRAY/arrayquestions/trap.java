public class trap {
  public static void main(String[] args) {
    int height[] = { 4, 2, 0, 6, 3, 2, 5 };
    System.out.println(traprain(height));
  }

  public static int traprain(int height[]) {
    int n = height.length;
    // calculate left boundary
    int leftboundary[] = new int[n];
    leftboundary[0] = height[0];
    for (int i = 1; i < n; i++) {
      leftboundary[i] = Math.max(height[i], leftboundary[i - 1]);

    }
    // calculate right boundary
    int rightboundary[] = new int[n];
    rightboundary[n-1] = height[n - 1];
    for (int i = n-2;i>=0; i--) {
      rightboundary[i] = Math.max(height[i], rightboundary[i + 1]);
    }
    int trappedwater=0;
    for (int i=0;i<n;i++) {

   
    int waterlevel = Math.min(leftboundary[i], rightboundary[i]);
    
    trappedwater+=waterlevel-height[i];
  }
  return trappedwater;
}

}