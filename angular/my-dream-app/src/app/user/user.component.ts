import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent {
name = "helloteam";
display = false;
color = "violet";
public cities=["tokyo","delhi","bangalore","mumbai"];
    @Input('parentData')
    public newLaptopName;

    @Output()
  public childEvent = new EventEmitter();


fireEvent(){
    this.childEvent.emit("hey, I'm from lenovo version 2.0");
  }

  logMessage(value){
    console.log(value);
      }
      
}
