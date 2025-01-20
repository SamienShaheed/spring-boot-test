import { Component } from '@angular/core';
import { UserService, User } from '../../services/user.service';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
})
export class UserFormComponent {
  user: User = { id: 0, name: '', email: '' };

  constructor(private userService: UserService) {}

  saveUser(): void {
    this.userService.addUser(this.user).subscribe(() => {
      this.user = { id: 0, name: '', email: '' };
    });
  }
}
