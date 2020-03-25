function power(base,power) {
    var result = 1;
    for (var i = 0; i < power; i++) {
      result = result * base;
    }
    return result;
}
