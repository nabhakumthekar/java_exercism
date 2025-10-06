export class BinarySearchTree {
  constructor(data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }

  // get data() {
  //   // return this.data;
  // }
  // get right() {
  //   return this.right;
  // }

  // get left() {
  //  return this.left;
  // }

  insert(value) {
   if(value <= this.data) {
     if(this.left === null) {
       this.left = new BinarySearchTree(value);
     } else {
       this.left.insert(value);
     }
   } else {
      if(this.right === null) {
       this.right = new BinarySearchTree(value);
     } else {
       this.right.insert(value);
     }
   }
  }

  each(callback) {
    if (this.left !== null) {
      this.left.each(callback);
    }

    callback(this.data);

    if (this.right !== null) {
      this.right.each(callback);
    }
  }
}
