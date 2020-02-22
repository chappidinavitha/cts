import { Rectangle } from './rectangle';
describe('',function(){
    it('testing area function',function(){
      
        //Arrange

         let rect=new Rectangle();

        //Act

          let actualResult=rect.getArea(10,20);

        //Assert
        let expectedResult=200;
        expect(actualResult).toBe(expectedResult)

    })
    it('testing parameter function',function(){
      
        //Arrange

         let rect=new Rectangle();

        //Act

          let actualResult=rect.getParameter(10,20);

        //Assert
        let expectedResult=60;
        expect(actualResult).toBe(expectedResult)

    })
    
})