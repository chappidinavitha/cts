import { Calculator } from './calculator';
describe('testing class',function(){
it('testing adding numbers',function(){
//Arrange
let cal=new Calculator();

//Act
let actualResult=cal.addNum(10,20);

//Assert
let expectedResult=30;
expect(actualResult).toBe(expectedResult)

})
it('testing sub numbers',function(){
    //Arrange
    let cal=new Calculator();
    
    //Act
    let actualResult=cal.subnum(20,10);
    
    //Assert
    let expectedResult=10;
    expect(actualResult).toBe(expectedResult)
})
})