int sum = ar.stream().mapToInt(Integer::intValue).sum(); // for ints
long sum = ar.stream().mapToLong(Long::longValue).sum(); // for longs
